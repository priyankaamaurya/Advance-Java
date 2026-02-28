package program9;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ISBN {
	
	@Id
	private int countryCode;
	private int bookCode;
	
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	
	 

}
