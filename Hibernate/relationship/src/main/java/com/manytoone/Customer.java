package com.manytoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "Customer1")
public class Customer {

	@Id
	private int cId; 
	private String cName;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy="customer") 
	private List<Product> products;
	
	public Customer() {
		
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Customer(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
		
	}
	 
	
}



