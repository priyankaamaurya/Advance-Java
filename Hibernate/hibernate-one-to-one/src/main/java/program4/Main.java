package program4;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Engine engine  = new Engine();
		engine.setEngineId(1231);
		engine.setEngineType("Diesel");
		
		Car car = new Car();
		car.setCarId(121);
		car.setCarName("Mercedes");
		car.setEngine(engine);
		
		em.persist(car);
		em.getTransaction().commit();
				
	}
}
