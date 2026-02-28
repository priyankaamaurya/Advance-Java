package program7;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Patient {
	
	@Id
	private int patientId;
	private String patientName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn (name= "patient_record")
	private MedicalRecord medRecord;
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public MedicalRecord getMedRecord() {
		return medRecord;
	}
	public void setMedRecord(MedicalRecord medRecord) {
		this.medRecord = medRecord;
	}
	
	public Patient() {
		
	}
	
	public Patient(int patientId, String patientName, MedicalRecord medRecord) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.medRecord = medRecord;
	}
	
}
