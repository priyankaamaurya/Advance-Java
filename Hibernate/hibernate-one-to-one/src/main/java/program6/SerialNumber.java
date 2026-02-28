package program6;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SerialNumber {

	@Id
	private String manufacturer;
	private String issueDate;
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	
	
}
