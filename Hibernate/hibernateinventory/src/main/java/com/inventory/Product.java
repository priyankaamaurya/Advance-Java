package com.inventory;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int productId;
	private String productName;
	private float productPrice;
	private String productQuality;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductQuality() {
		return productQuality;
	}
	public void setProductQuality(String productQuality) {
		this.productQuality = productQuality;
	}
	
	
		
}
