package program1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {
 
	@Id
	private int profileId;
	private String bio;
	
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
}
