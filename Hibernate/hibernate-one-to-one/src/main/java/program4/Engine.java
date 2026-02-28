package program4;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {
		
	@Id
	private int engineId;
	private String engineType;
	
	public int getEngineId() {
		return engineId;
	}
	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
		
}
