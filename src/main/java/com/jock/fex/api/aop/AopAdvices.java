package com.jock.fex.api.aop;

import com.jock.fex.api.base.BaseReq;
import com.jock.fex.api.base.BaseResp;
import com.jock.fex.api.exception.ApplicationException;
import com.jock.fex.api.util.YmlPropsUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;

import java.util.HashMap;
import java.util.Map;


public class AopAdvices {


    /**
     * 请求环绕通知
     *
     * @param logger
     * @param point
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static Object aroundNotice(Logger logger, ProceedingJoinPoint point) {
        logger.info("@Around：进入环绕通知");

        // 访问目标方法的参数：
        final Object[] args = point.getArgs();

        // 参数处理
        final BaseResp resp = paramHandle(logger, args);
        if (resp != null) {
            return resp;
        }

        // 执行目标方法
        final long start = System.currentTimeMillis();
        Object returnValue = null;
        try {
            returnValue = point.proceed(args);
        } catch (Throwable e) {
            logger.error("mapping 方法：" + point.getSignature());
            logger.error("异常信息：", e);
            e.printStackTrace();
            if (e instanceof NullPointerException) {
                returnValue = new BaseResp().setFail(502002, "空指针异常");
            } else if (e instanceof ApplicationException) {
                returnValue = ((ApplicationException) e).getResp();
                logger.error(returnValue.toString());
            } else {
                returnValue = new BaseResp().setFail(500, "系统繁忙，请稍后再试");
            }

            String transactionMessage = "";
            try {
                // 手动回滚事务
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                logger.info("事务回滚成功");
                transactionMessage = "事务回滚成功";
            } catch (Exception ex) {
                transactionMessage = "事务回滚失败：" + ex.getMessage();
                logger.info("事务回滚失败：" + ex.getMessage());
            }

            // 保存异常信息到数据库
            exceptionLogger(returnValue, e, point, logger, transactionMessage);
        }

        logger.info("@Around：前置通知执行完成");
        logger.info("执行所需时间：" + (System.currentTimeMillis() - start) + "ms");

        return returnValue;
    }

    /**
     * 参数处理
     *
     * @param logger
     * @param args
     * @return
     */
    @SuppressWarnings("rawtypes")
    private static BaseResp paramHandle(Logger logger, Object[] args) {
        try {
            final BaseResp resp = new BaseResp();
            if (args != null && args.length > 0) {
                for (Object obj : args) {
                    if (obj instanceof BaseReq) {
                        // 判断请求参数是否存在
                        final BaseReq req = ((BaseReq) obj);
                        logger.info("t:" + req.getT() + ",s:" + req.getS() + ",v:" + req.getV());
                        if (req != null && (StringUtils.isEmpty(req.getT()) || StringUtils.isEmpty(req.getS()))) {
                            return resp.setFail(501001, "param t、s must need");
                        }
                    } else if (obj instanceof BindingResult) {
                        final BindingResult result = ((BindingResult) obj);
                        if (result.hasErrors()) {
                            // spring校验不通过
                            return resp.setFail(505010, result.getFieldErrors().get(0).getDefaultMessage());
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResp().setFail(500, e.getMessage());
        }
        return null;
    }

    /**
     * 获取异常项目版本
     *
     * @param args
     * @return
     */
    private static String paramVersion(Object[] args) {
        if (args != null && args.length > 0) {
            for (Object obj : args) {
                if (obj instanceof BaseReq) {
                    return ((BaseReq) obj).getV();
                }
            }
        }
        return "";
    }

    /**
     * 保存异常信息
     *
     * @param returnValue
     * @param e
     * @param point
     * @param logger
     * @param transactionMessage
     */
    private static void exceptionLogger(Object returnValue, Throwable e, ProceedingJoinPoint point, Logger logger,
                                        String transactionMessage) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    // 捕抓异常类
                    final Map<String, Object> params = new HashMap<>();
                    params.put("version", paramVersion(point.getArgs()));// 异常项目版本
                    params.put("exceptionTarget", YmlPropsUtil.getServiceName());// 异常项目服务名称
                    params.put("exceptionSignature", point.getSignature());// 项目方法名称
                    if (StringUtils.hasText(e.getMessage())) {
                        params.put("exceptionMessage", e.getMessage());// 异常信息
                    } else {
                        params.put("exceptionMessage", returnValue);// 异常信息
                    }
                    params.put("exceptionType", 0);// 异常类型 0：后台 1：ios 2:android
                    params.put("transactionMessage", transactionMessage);

                    // 保存捕抓到的异常


                } catch (Exception ei) {
                    logger.info("捕抓异常发现异常：", ei);
                }
            }
        }).start();

    }

}
