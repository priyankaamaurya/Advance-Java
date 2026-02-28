package program5;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Voter {

	@Id
	private String voterName;
	private String city;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "voter_id")
	private VoterID voterid;
	
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public VoterID getVoterid() {
		return voterid;
	}
	public void setVoterid(VoterID voterid) {
		this.voterid = voterid;
	}
	
	public Voter() {
		
	}
	public Voter(String voterName, String city, VoterID voterid) {
		super();
		this.voterName = voterName;
		this.city = city;
		this.voterid = voterid;
	} 
	 
}
