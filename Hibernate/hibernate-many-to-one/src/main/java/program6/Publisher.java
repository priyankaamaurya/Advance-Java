package program6;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publisher {

	@Id
	private String publisherName;
	private String publisherCity;
	
	@OneToMany(cascade=CascadeType.ALL, fetch= FetchType.LAZY,mappedBy="publisher")
	private List<Books> book;

	public Publisher() {
		
	}

	public Publisher(String publisherName, String publisherCity) {
		super();
		this.publisherName = publisherName;
		this.publisherCity = publisherCity;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherCity() {
		return publisherCity;
	}

	public void setPublisherCity(String publisherCity) {
		this.publisherCity = publisherCity;
	}

	public List<Books> getBook() {
		return book;
	}

	public void setBook(List<Books> book) {
		this.book = book;
	}
	
}
