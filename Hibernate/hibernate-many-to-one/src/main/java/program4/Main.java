package program4;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Customer customer = new Customer(121, "Akhil");	
		
		Orders o1 = new Orders(101, "Reached", customer);
		Orders o2 = new Orders(102, "Not Reached", customer);
		Orders o3 = new Orders(103, "Reached", customer);
		
		customer.setOrders(Arrays.asList(o1, o2, o3));
		
		em.persist(customer);
		em.getTransaction().commit();
		}
}
