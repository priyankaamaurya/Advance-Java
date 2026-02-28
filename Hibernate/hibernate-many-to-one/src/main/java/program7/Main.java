package program7;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em =emf.createEntityManager();
		em.getTransaction().begin();
		
		Director director = new Director("Rajkumar Hirani", 62);
		
		Movies m1 = new Movies("3 idiots",2009,director);
		Movies m2 = new Movies("Munna Bhai M.B.B.S.",2003,director);
		Movies m3 = new Movies("PK",2014,director);
		
		director.setMovie(Arrays.asList(m1, m2, m3));
		
		em.persist(director);
		em.getTransaction().commit();
	}

}
