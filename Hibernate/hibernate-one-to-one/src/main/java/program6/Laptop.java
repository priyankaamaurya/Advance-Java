package program6;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Laptop {

	@Id
	private String brand;
	private String model;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="laptop_no")
	private SerialNumber sno;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public SerialNumber getSno() {
		return sno;
	}
	public void setSno(SerialNumber sno) {
		this.sno = sno;
	}
	
	public Laptop() {
		
	}
	
	public Laptop(String brand, String model, SerialNumber sno) {
		super();
		this.brand = brand;
		this.model = model;
		this.sno = sno;
	}
	
	
	
}
