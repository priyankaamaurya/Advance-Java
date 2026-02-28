package program6;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Books {

	@Id
	private String bookTitle;
	private String bookAuthor;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "publisher")
	private Publisher publisher;

	public Books() {
		
	}

	public Books(String bookTitle, String bookAuthor, Publisher publisher) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.publisher = publisher;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	
	
	
}
