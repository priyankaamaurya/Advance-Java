package program10;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Bank {

	@Id
	private String bankName;
	private String city;
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name="bank_ifsc")
	private IFSC ifsc;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public IFSC getIfsc() {
		return ifsc;
	}
	public void setIfsc(IFSC ifsc) {
		this.ifsc = ifsc;
	}

	
}
