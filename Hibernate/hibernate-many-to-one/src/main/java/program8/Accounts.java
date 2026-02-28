package program8;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Accounts {

	@Id
	private double accountBalance;
	private String accountType;
	
	@ManyToOne(cascade= CascadeType.ALL, fetch= FetchType.EAGER)
	@JoinColumn(name="bank_account")
	private Bank bank;

	public Accounts() {
	
	}

	public Accounts(double accountBalance, String accountType, Bank bank) {
		super();
		this.accountBalance = accountBalance;
		this.accountType = accountType;
		this.bank = bank;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
}
