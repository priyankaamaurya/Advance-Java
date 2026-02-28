package program6;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Publisher publisher = new Publisher("Pearson Education", "New Delhi");
		
		Books b1 = new Books("Java Programming", "Herbert Schildt", publisher);
		Books b2 = new Books("C Programming", "Dennis Ritchie", publisher);
		Books b3 = new Books("Python Programming", "Guido van Rossum", publisher);

		publisher.setBook(Arrays.asList(b1, b2, b3));
		
		em.persist(publisher);
		em.getTransaction().commit();
		
	}
}
