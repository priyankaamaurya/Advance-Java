package program1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	private int userId;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "profile_id")
	private Profile profile;
	
	public User() {

	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	public User(int userId, String name, Profile profile) {
		super();
		this.userId = userId;
		this.name = name;
		this.profile = profile;
	}
	
	
}
