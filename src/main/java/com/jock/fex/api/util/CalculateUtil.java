package com.jock.fex.api.util;

import com.jock.fex.api.feign.model.CalculateParamsReq;
import com.jock.fex.api.feign.model.CalculateScheme;
import com.jock.fex.api.feign.model.GraduationRate;

import java.math.BigDecimal;
import java.util.List;

public class CalculateUtil {
	/**
	 * 财务计算
	 * @param calculateParams
	 * @param calculateScheme
	 */
	public static void calculate(CalculateParamsReq calculateParams,CalculateScheme calculateScheme){
		//判断计算方式
		BigDecimal money = calculateParams.getMoney() == null?BigDecimal.ZERO:calculateParams.getMoney();
		BigDecimal accumulate = calculateParams.getAccumulate() == null?BigDecimal.ZERO:calculateParams.getAccumulate();//实收总业绩
		BigDecimal collection = calculateParams.getCollection() == null?BigDecimal.ZERO:calculateParams.getCollection();//收款记录
		String formula = calculateParams.getFormula();
		BigDecimal scale = new BigDecimal("100");
		//1.根据收款月、成交月、部门实收业绩任务标准结算
		if(calculateScheme.getCalculateType() == 0||calculateScheme.getCalculateType() == 1){
			List<GraduationRate> graduationRates = calculateScheme.getGraduationRates();
			int i = 0;
			do{
				//就在第一级
				if(graduationRates.get(0).getTopline() == null ||graduationRates.get(0).getTopline().compareTo(accumulate.add(collection)) != -1){
					money =  money.add(graduationRates.get(0).getShareRate().divide(scale,2).multiply(collection));
					formula = (formula==null?"": formula+"+")+ graduationRates.get(0).getShareRate().divide(scale,2,BigDecimal.ROUND_HALF_UP)+"*"+collection;
				}else{
					//继续跳吧
					if(graduationRates.get(i).getTopline() != null && (accumulate.compareTo(graduationRates.get(i).getLowerline()) == -1 || accumulate.compareTo(BigDecimal.ZERO) == 0)
							&& accumulate.add(collection).compareTo(graduationRates.get(i).getTopline()) != -1){
						money = money.add(graduationRates.get(i).getShareRate().divide(scale,2,BigDecimal.ROUND_HALF_UP).multiply(graduationRates.get(i).getTopline().subtract(graduationRates.get(i).getLowerline())));
						formula = (formula==null?"": formula+"+")+ graduationRates.get(i).getShareRate().divide(scale,2,BigDecimal.ROUND_HALF_UP)+"*"+(graduationRates.get(i).getTopline().subtract(graduationRates.get(i).getLowerline()));
					}
					//在中间，继续跳吧
					if(accumulate.compareTo(BigDecimal.ZERO) != 0 && graduationRates.get(i).getTopline() != null 
							&& accumulate.compareTo(graduationRates.get(i).getTopline()) == -1 && accumulate.add(collection).compareTo(graduationRates.get(i).getTopline()) != -1){
						money = money.add(graduationRates.get(i).getShareRate().divide(scale,2,BigDecimal.ROUND_HALF_UP).multiply(graduationRates.get(i).getTopline().subtract(accumulate)));
						formula = (formula==null?"": formula+"+")+ graduationRates.get(i).getShareRate().divide(scale,2,BigDecimal.ROUND_HALF_UP)+"*"+(graduationRates.get(i).getTopline().subtract(accumulate));
					}
					//在中间，算到头了
					if((graduationRates.get(i).getTopline() == null || graduationRates.get(i).getTopline().compareTo(accumulate.add(collection)) != -1 )
							&& graduationRates.get(i).getLowerline().compareTo(accumulate) == 1 &&graduationRates.get(i).getLowerline().compareTo(accumulate.add(collection)) == -1){
						money =  money.add(graduationRates.get(i).getShareRate().divide(scale,2,BigDecimal.ROUND_HALF_UP).multiply(accumulate.add(collection).subtract(graduationRates.get(i).getLowerline())));
						formula = (formula==null?"": formula+"+")+ graduationRates.get(i).getShareRate().divide(scale,2,BigDecimal.ROUND_HALF_UP)+"*"+accumulate.add(collection).subtract(graduationRates.get(i).getLowerline());
					}
					//就在跳吧区间，算到头了
					if((graduationRates.get(i).getTopline() == null || graduationRates.get(i).getTopline().compareTo(accumulate.add(collection)) != -1)
							&& graduationRates.get(i).getLowerline().compareTo(accumulate) == -1){
						money =  money.add(graduationRates.get(i).getShareRate().divide(scale,2,BigDecimal.ROUND_HALF_UP).multiply(collection));
						formula = (formula==null?"": formula+"+")+ graduationRates.get(i).getShareRate().divide(scale,2,BigDecimal.ROUND_HALF_UP)+"*"+collection;
					}
				}
				i++;
			}
			while(i<graduationRates.size() && graduationRates.get(i).getLowerline().compareTo(accumulate.add(collection)) == -1);
		}
		//2.固定比例
		if(calculateScheme.getCalculateType() == 2){
			money = money.add(calculateScheme.getFixAmount().divide(scale,2,BigDecimal.ROUND_HALF_UP).multiply(collection));
			formula = calculateScheme.getFixAmount().divide(scale,2,BigDecimal.ROUND_HALF_UP)+"*"+collection;
		}
		//3.固定金额
		if(calculateScheme.getCalculateType() == 3){
			money = money.add(calculateScheme.getFixAmount());
			formula = calculateScheme.getFixAmount()+"";
			calculateParams.setParam(calculateScheme.getFixAmount());
		}
		//4.成交月成交业绩所属区间,按统一比例计算
		if(calculateScheme.getCalculateType() == 4){
			List<GraduationRate> graduationRates = calculateScheme.getGraduationRates();
			int i = 0;
			for (GraduationRate graduationRate : graduationRates) {
				//算到头了
				if(graduationRate.getTopline() == null || (graduationRate.getTopline().compareTo(accumulate.add(collection)) != -1 && graduationRate.getLowerline().compareTo(accumulate.add(collection)) == -1)){
					money = money.add(graduationRates.get(i).getShareRate().divide(scale,2,BigDecimal.ROUND_HALF_UP).multiply(calculateParams.getCollection()));
					calculateParams.setParam(graduationRates.get(i).getShareRate());
					formula = (formula==null?"":formula+"+")+ graduationRates.get(i).getShareRate().divide(scale,2,BigDecimal.ROUND_HALF_UP)+"*"+collection;
					break;
				}
			}
		}
		calculateParams.setMoney(money);
		calculateParams.setFormula(formula);
	}
}
