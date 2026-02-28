package program10;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comments {

	@Id
	private String commentText;
	private int likesCount;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="blog_comment")
	private Blog blog;

	public Comments() {
		
	}

	public Comments(String commentText, int likesCount, Blog blog) {
		super();
		this.commentText = commentText;
		this.likesCount = likesCount;
		this.blog = blog;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public int getLikesCount() {
		return likesCount;
	}

	public void setLikesCount(int likesCount) {
		this.likesCount = likesCount;
	}

	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	
}
