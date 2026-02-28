package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int proId;
	private String proName;
	
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

	public Product(int proId, String proName) {
		super();
		this.proId = proId;
		this.proName = proName;
	}
	
	
	
}
