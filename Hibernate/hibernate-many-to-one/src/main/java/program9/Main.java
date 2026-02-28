package program9;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("java");
		EntityManager em =emf.createEntityManager();
		em.getTransaction().begin();
		
		Airline airline = new Airline("Indigo","6E");
		
		Flights f1 = new Flights("6E203", "Delhi",airline);
		Flights f2 = new Flights("6E403", "Mumbai",airline);
		Flights f3 = new Flights("6E123", "Lucknow",airline);
		
		airline.setFlight(Arrays.asList(f1, f2, f3));
		
		em.persist(airline);
		em.getTransaction().commit();
	}
}
