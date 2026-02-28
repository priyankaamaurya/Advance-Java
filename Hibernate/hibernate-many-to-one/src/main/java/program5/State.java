package program5;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class State {

	@Id
	private String stateName;
	private int noOfDistricts;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy="state")
	private List<Cities> city;

	public State() {
		
	}

	public State(String stateName, int noOfDistricts) {
		super();
		this.stateName = stateName;
		this.noOfDistricts = noOfDistricts;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getNoOfDistricts() {
		return noOfDistricts;
	}

	public void setNoOfDistricts(int noOfDistricts) {
		this.noOfDistricts = noOfDistricts;
	}

	public List<Cities> getCity() {
		return city;
	}

	public void setCity(List<Cities> city) {
		this.city = city;
	}
	
	
	
}
