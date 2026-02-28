package program2;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Department dept = new Department(1001, "Computer Science");
		
		Employees e1 =new Employees(1, "Ananya", dept);
		Employees e2 =new Employees(2, "Amrit", dept);
		Employees e3 =new Employees(3, "Aman", dept);
		
		dept.setEmployees(Arrays.asList(e1, e2, e3)); 
		
		em.persist(dept);
		em.getTransaction().commit();
		
		
	}
}
