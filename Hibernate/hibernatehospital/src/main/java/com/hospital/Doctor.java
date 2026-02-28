package com.hospital;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {

	@Id
	private int doctorId;
	private String doctorName;
	private float consultationFee;
	private String specialization;
	
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorname() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public float getConsultationFee() {
		return consultationFee;
	}
	public void setConsultationFee(float consultationFee) {
		this.consultationFee = consultationFee;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
		
}
