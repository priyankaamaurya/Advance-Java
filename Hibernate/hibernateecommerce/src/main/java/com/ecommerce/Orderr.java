package com.ecommerce;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orderr {

	@Id
	private int orderId;
	private String orderDate;
	private double orderAmount;
	private String orderStatus;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(	int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
}