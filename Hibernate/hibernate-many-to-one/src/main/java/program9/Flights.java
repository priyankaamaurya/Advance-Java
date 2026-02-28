package program9;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Flights {

	@Id
	private String flightNumber;
	private String sourceCity;
	
	@ManyToOne(cascade= CascadeType.ALL,fetch= FetchType.EAGER)
	@JoinColumn(name="airline_flight")
	private Airline airline;

	public Flights() {
		
	}

	public Flights(String flightNumber, String sourceCity, Airline airline) {
		super();
		this.flightNumber = flightNumber;
		this.sourceCity = sourceCity;
		this.airline = airline;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	
}
