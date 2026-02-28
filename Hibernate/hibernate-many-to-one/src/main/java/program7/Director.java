package program7;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Director {

	@Id
	private String directorName;
	private int directorAge;
	
	@OneToMany(cascade = CascadeType.ALL, fetch= FetchType.LAZY, mappedBy="director")
	private List<Movies> movie;

	public Director() {
		
	}

	public Director(String directorName, int directorAge) {
		super();
		this.directorName = directorName;
		this.directorAge = directorAge;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public int getDirectorAge() {
		return directorAge;
	}

	public void setDirectorAge(int directorAge) {
		this.directorAge = directorAge;
	}

	public List<Movies> getMovie() {
		return movie;
	}

	public void setMovie(List<Movies> movie) {
		this.movie = movie;
	}
	
}
