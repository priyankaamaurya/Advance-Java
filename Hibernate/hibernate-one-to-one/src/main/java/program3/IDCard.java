package program3;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IDCard {
	
	@Id
	private String dob;
	private long phoneNo;
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
