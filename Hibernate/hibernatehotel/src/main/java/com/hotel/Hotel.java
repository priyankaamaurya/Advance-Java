package com.hotel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {

	@Id
	private int hotelId;
	private String hotelName;
	private double hotelPrice;
	private String hotelLocation;
	
	
	public int getId() {
		return hotelId;
	}
	public void setId(int id) {
		this.hotelId = id;
	}
	public String getName() {
		return hotelName;
	}
	public void setName(String name) {
		this.hotelName = name;
	}
	public double getPrice() {
		return hotelPrice;
	}
	public void setPrice(int price) {
		this.hotelPrice = price;
	}
	public String getLocation() {
		return hotelLocation;
	}
	public void setDob(String location) {
		this.hotelLocation = location;
	}
	
	@Override
    public String toString() {
		return "Person [id=" + hotelId + ", name=" + hotelName + ", age=" + hotelPrice + ", dob=" + hotelLocation + "]";
      
    }		 
		
}


