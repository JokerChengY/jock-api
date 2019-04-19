package com.jock.fex.api.feign.model.vo;

/**
 * 2019年1月15日<br>
 * App我的产品订单最新信息
 * 
 * @author 0
 *
 */
public class AppOrderLastNews {

	private int receiptCount;// 接单数
	private int orderCount; // 下单数
	private AppProgress productOrder = new AppProgress();
	private AppProgress customerOrder = new AppProgress();

	/**
	 * @return the receiptCount
	 */
	public int getReceiptCount() {
		return receiptCount;
	}

	/**
	 * @param receiptCount
	 *            the receiptCount to set
	 */
	public void setReceiptCount(int receiptCount) {
		this.receiptCount = receiptCount;
	}

	/**
	 * @return the orderCount
	 */
	public int getOrderCount() {
		return orderCount;
	}

	/**
	 * @param orderCount
	 *            the orderCount to set
	 */
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	/**
	 * @return the productOrder
	 */
	public AppProgress getProductOrder() {
		return productOrder;
	}

	/**
	 * @param productOrder
	 *            the productOrder to set
	 */
	public void setProductOrder(AppProgress productOrder) {
		this.productOrder = productOrder;
	}

	/**
	 * @return the customerOrder
	 */
	public AppProgress getCustomerOrder() {
		return customerOrder;
	}

	/**
	 * @param customerOrder
	 *            the customerOrder to set
	 */
	public void setCustomerOrder(AppProgress customerOrder) {
		this.customerOrder = customerOrder;
	}

}
