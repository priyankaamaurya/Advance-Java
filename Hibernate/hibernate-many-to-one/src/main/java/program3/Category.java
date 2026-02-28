package program3;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	private String categoryName;
	private String categoryStatus;
	
	@OneToMany(cascade= CascadeType.ALL, fetch= FetchType.LAZY, mappedBy ="category")
	private List<Products> products;

	public Category() {
		
	}

	public Category(String categoryName, String categoryStatus) {
		super();
		this.categoryName = categoryName;
		this.categoryStatus = categoryStatus;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryStatus() {
		return categoryStatus;
	}

	public void setCategoryStatus(String categoryStatus) {
		this.categoryStatus = categoryStatus;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
	
	
}
