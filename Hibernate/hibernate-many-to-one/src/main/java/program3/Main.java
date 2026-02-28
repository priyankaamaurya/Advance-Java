package program3;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Category category = new Category("Electronics", "Acitve");
		
		Products p1 = new Products(1,"Laptop", category);
		Products p2 = new Products(2,"TV", category);
		Products p3 = new Products(3,"Watch", category);
		
		category.setProducts(Arrays.asList(p1, p2, p3));
		
		em.persist(category);
		em.getTransaction().commit();
		
	}
}
