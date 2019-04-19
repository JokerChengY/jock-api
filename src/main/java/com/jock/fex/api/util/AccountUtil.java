package com.jock.fex.api.util;

import com.jock.fex.api.feign.dto.AccountTypeDTO;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class AccountUtil {

	/**
	 * 用户类型
	 */
	public final static Map<Integer, String> ACCOUNT_TYPE = new HashMap<Integer, String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{

			put(0, "普通");
			put(1, "中介");
			put(2, "按揭员");
			put(3, "评估员");
			put(4, "未认证中介");
			put(5, "合伙人");

		}
	};

	/**
	 * 根据type id 获取名称
	 * 
	 * @param type
	 *            多个以英文逗号隔开
	 * @return
	 */
	public final static String getTypeName(String type) {
		String typeName = "";
		if (!StringUtils.isEmpty(type)) {
			final String[] typeArr = type.split(",");
			for (String s : typeArr) {
				if (s.matches("\\d+")) {
					typeName += ACCOUNT_TYPE.get(Integer.valueOf(s)) + "，";
				}
			}
			if (!StringUtils.isEmpty(typeName)) {
				typeName = typeName.substring(0, typeName.length() - 1);
			}
		}
		return typeName;
	}

	public static boolean checkAccountType(String types, List<AccountTypeDTO> accountTypes) {
		return checkType(accountTypes, dto -> doCheckAccountType(types, dto.getType().toString()));
	}

	public static boolean checkAccountType(String types, String type) {
		return doCheckAccountType(types, type);
	}

	private static boolean doCheckAccountType(String types, String type) {
		return addComma(types).indexOf(addComma(type)) != -1;
	}

	private static String addComma(String str) {
		return "," + str + ",";
	}

	public static boolean checkSimpleUser(List<AccountTypeDTO> typeDTOs) {
		return checkType(typeDTOs, 0);
	}

	public static boolean checkMediator(List<AccountTypeDTO> typeDTOs) {
		return checkType(typeDTOs, 1);
	}

	public static boolean checkMortgage(List<AccountTypeDTO> typeDTOs) {
		return checkType(typeDTOs, 2);
	}

	public static boolean checkEvaluationCompany(List<AccountTypeDTO> typeDTOs) {
		return checkType(typeDTOs, 3);
	}

	public static boolean checkNonAuthMediator(List<AccountTypeDTO> typeDTOs) {
		return checkType(typeDTOs, 4);
	}

	public static boolean checkPartner(List<AccountTypeDTO> typeDTOs) {
		return checkType(typeDTOs, 5);
	}

	private static boolean checkType(List<AccountTypeDTO> typeDTOs, int type) {
		return checkType(typeDTOs, t -> t.getType().equals(type));
	}

	private static boolean checkType(List<AccountTypeDTO> typeDTOs, Predicate<AccountTypeDTO> p) {
		if (typeDTOs.size() == 1) {
			return p.test(typeDTOs.get(0));
		} else {
			return typeDTOs.stream().anyMatch(p);
		}
	}
}
