package program9;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Book {

	@Id
	private int bookId;
	private String bookAuthor;
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="book_isbn")
	private ISBN isbn;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public ISBN getIsbn() {
		return isbn;
	}
	public void setIsbn(ISBN isbn) {
		this.isbn = isbn;
	}
		
}
