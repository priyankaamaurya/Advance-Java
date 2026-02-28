package program10;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Blog {

	@Id
	private String blogTitle;
	private int publisherYear;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy="blog")
	private List<Comments> comment;

	public Blog() {
		
	}

	public Blog(String blogTitle, int publisherYear) {
		super();
		this.blogTitle = blogTitle;
		this.publisherYear = publisherYear;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public int getPublisherYear() {
		return publisherYear;
	}

	public void setPublisherYear(int publisherYear) {
		this.publisherYear = publisherYear;
	}

	public List<Comments> getComment() {
		return comment;
	}

	public void setComment(List<Comments> comment) {
		this.comment = comment;
	}
	
	
	
	
}
