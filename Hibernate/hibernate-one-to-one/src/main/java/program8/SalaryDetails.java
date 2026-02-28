package program8;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SalaryDetails {
	
	@Id
	private String bankName;
	private  long accNum;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	
	

}
