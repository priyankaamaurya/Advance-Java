package program5;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cities {

	@Id
	private String cityName;
	private int cityPincode;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="state_city")
	private State state;

	public Cities() {
		
	}

	public Cities(String cityName, int cityPincode, State state) {
		super();
		this.cityName = cityName;
		this.cityPincode = cityPincode;
		this.state = state;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getCityPincode() {
		return cityPincode;
	}

	public void setCityPincode(int cityPincode) {
		this.cityPincode = cityPincode;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
}
