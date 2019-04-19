package com.jock.fex.api.interceptor;

import com.jock.fex.api.base.PageBean;
import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.scripting.defaults.DefaultParameterHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 * 分页拦截器
 * 
 * @author 0
 *
 */
@Intercepts({ @org.apache.ibatis.plugin.Signature(method = "prepare", type = StatementHandler.class, args = {
		Connection.class, Integer.class }) })
public class PageInterceptor implements Interceptor {
	private static final Log logger = LogFactory.getLog(PageInterceptor.class);
	private static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
	private static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
	private static String DEFAULT_PAGE_SQL_ID = ".*ByPage$";
	private String databaseType;

	public Object intercept(Invocation invocation) throws Throwable {
		RoutingStatementHandler statementHandler = (RoutingStatementHandler) invocation.getTarget();
		MetaObject metaStatementHandler = MetaObject.forObject(statementHandler, DEFAULT_OBJECT_FACTORY,
				DEFAULT_OBJECT_WRAPPER_FACTORY, new DefaultReflectorFactory());

		MappedStatement mappedStatement = (MappedStatement) metaStatementHandler.getValue("delegate.mappedStatement");
		BoundSql boundSql = (BoundSql) metaStatementHandler.getValue("delegate.boundSql");
		String originalSql = boundSql.getSql();
		if (mappedStatement.getId().matches(DEFAULT_PAGE_SQL_ID)) {
			Object parameterObject = boundSql.getParameterObject();
			if (parameterObject == null) {
				logger.error("parameterObject is null!");
				throw new NullPointerException("parameterObject is null!");
			}
			if ((parameterObject instanceof PageBean)) {
				PageBean<?> page = (PageBean) parameterObject;
				if (page.isRequireTotal()) {
					setTotalRecord(page, mappedStatement);
				}
				String pageSql = getPageSql(page, originalSql);
				metaStatementHandler.setValue("delegate.boundSql.sql", pageSql);

				metaStatementHandler.setValue("delegate.rowBounds.offset", Integer.valueOf(0));
				metaStatementHandler.setValue("delegate.rowBounds.limit", Integer.valueOf(Integer.MAX_VALUE));
			}
		}
		return invocation.proceed();
	}

	private void setTotalRecord(PageBean<?> page, MappedStatement mappedStatement) {
		BoundSql boundSql = mappedStatement.getBoundSql(page);
		String sql = boundSql.getSql();
		String countSql = getCountSql(sql);

		List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();

		BoundSql countBoundSql = new BoundSql(mappedStatement.getConfiguration(), countSql, parameterMappings, page);

		ParameterHandler parameterHandler = new DefaultParameterHandler(mappedStatement, page, countBoundSql);

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection connection = null;
		try {
			connection = mappedStatement.getConfiguration().getEnvironment().getDataSource().getConnection();
			pstmt = connection.prepareStatement(countSql);

			parameterHandler.setParameters(pstmt);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int totalRecord = rs.getInt(1);
				page.setTotalRecord(totalRecord);
			}
			return;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private String getCountSql(String originalSql) {
		StringBuffer countSql = new StringBuffer();
		countSql.append("select count(1) from (").append(originalSql).append(") t");
		return countSql.toString();
	}

	public Object plugin(Object target) {
		if ((target instanceof StatementHandler)) {
			return Plugin.wrap(target, this);
		}
		return target;
	}

	public void setProperties(Properties properties) {
	}

	private String getPageSql(PageBean<?> page, String sql) {
		StringBuffer sqlBuffer = new StringBuffer(sql);
		if ("mysql".equalsIgnoreCase(this.databaseType)) {
			return getMysqlPageSql(page, sqlBuffer);
		}
		if ("oracle".equalsIgnoreCase(this.databaseType)) {
			return getOraclePageSql(page, sqlBuffer);
		}
		return sqlBuffer.toString();
	}

	private String getMysqlPageSql(PageBean<?> page, StringBuffer sqlBuffer) {
		int offset = (page.getNowPage() - 1) * page.getPageSize();
		sqlBuffer.append(" limit ").append(offset).append(",");
		sqlBuffer.append(page.getPageSize());
		return sqlBuffer.toString();
	}

	private String getOraclePageSql(PageBean<?> page, StringBuffer sqlBuffer) {
		int offset = (page.getNowPage() - 1) * page.getPageSize() + 1;
		sqlBuffer.insert(0, "select u.*, rownum r from (").append(") u where rownum < ")
				.append(offset + page.getPageSize());
		sqlBuffer.insert(0, "select * from (").append(") where r >= ").append(offset);
		return sqlBuffer.toString();
	}

	public String getDatabaseType() {
		return this.databaseType;
	}

	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
	}
}