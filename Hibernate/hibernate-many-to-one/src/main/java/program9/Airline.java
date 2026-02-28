package program9;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Airline {

	@Id
	private String airlineName;
	private String airlineCode;
	
	@OneToMany(cascade = CascadeType.ALL,fetch= FetchType.LAZY,mappedBy="airline")
	private List<Flights> flight;
	
	public Airline() {
	
	}

	public Airline(String airlineName, String airlineCode) {
		super();
		this.airlineName = airlineName;
		this.airlineCode = airlineCode;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public List<Flights> getFlight() {
		return flight;
	}

	public void setFlight(List<Flights> flight) {
		this.flight = flight;
	}
	
}
