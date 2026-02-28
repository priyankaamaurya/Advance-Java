package program10;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IFSC {

	@Id
	private String bankCode;
	private int branchCode;
	
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	
	
}
