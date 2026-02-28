package program4;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car {

	@Id
	private int carId;
	private String carName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "engine_id")
	private Engine engine;
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Car() {
		
	}
	
	public Car(int carId, String carName, Engine engine) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.engine = engine;
	}
	
	
	
}
