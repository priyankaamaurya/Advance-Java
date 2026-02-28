package com.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "Product1")
public class Product {

	@Id
	private int proId;
	private String proName;
	@ManyToOne
	private Customer customer;
	
	public Product(int proId, String proName, Customer customer) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.customer = customer;
	}

	public Product() {
		
	}
	
	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}



