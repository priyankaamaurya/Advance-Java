package program8;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {

	@Id
	private String bankName;
	private String bankType;
	
	@OneToMany(cascade= CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="bank")
	private List<Accounts> account;

	public Bank() {
		
	}

	public Bank(String bankName, String bankType) {
		super();
		this.bankName = bankName;
		this.bankType = bankType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public List<Accounts> getAccount() {
		return account;
	}

	public void setAccount(List<Accounts> account) {
		this.account = account;
	}
	
	
	
}
