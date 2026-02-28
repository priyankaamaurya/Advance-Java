package com.jspentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="student_table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rol;
	@Column(name ="username", nullable=true)
	private String name;
	@Column(unique=true)
	private String email;
	private Long phone;
	private String password; 
	private String address;
	
	public Student() {
		
	}

	public int getRol() {
		return rol;
	}

	public void setRol(int rol) {
		this.rol = rol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(int rol, String name, String email, Long phone, String password, String address) {
		super();
		this.rol = rol;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.address = address;
	}
	
	
}
