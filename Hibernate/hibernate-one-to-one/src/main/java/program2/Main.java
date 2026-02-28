package program2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	
	Address address = new Address();
	address.setArea("Sector-17");
	address.setCity("Gurgaon");
	
	Employee employee = new Employee();
	employee.setEmployeeId(101);
	employee.setEmployeeName("Farhan");
	employee.setAddress(address);
	
	em.persist(employee);
	em.getTransaction().commit();
	
	}
}
