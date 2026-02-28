package program7;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MedicalRecord {

	@Id
	private String diagnosis;
	private String issueDate;
	
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
}
