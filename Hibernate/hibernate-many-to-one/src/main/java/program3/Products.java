package program3;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Products {

	@Id
	private int productId;
	private String productName;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch =FetchType.EAGER)
	@JoinColumn(name ="category_pro")
	private Category category;

	public Products() {
		
	}

	public Products(int productId, String productName, Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
