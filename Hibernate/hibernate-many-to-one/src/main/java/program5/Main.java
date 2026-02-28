package program5;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		State state = new State("UttarPradesh", 75);
		
		Cities c1 = new Cities("Lucknow", 226001, state);
		Cities c2 = new Cities("Raebareli", 229404, state);
		Cities c3 = new Cities("Kanpur", 208001, state);
		
		state.setCity(Arrays.asList(c1, c2, c3));
		em.persist(state);
		em.getTransaction().commit();
	}
}
