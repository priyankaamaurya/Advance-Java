package program6;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		SerialNumber sno = new SerialNumber();
		sno.setManufacturer("Dell");
		sno.setIssueDate("16/03/2022");
		
		Laptop laptop = new Laptop();
		laptop.setBrand("Dell");
		laptop.setModel("Inspiron 15");
		laptop.setSno(sno);
		
		em.persist(laptop);
		em.getTransaction().commit();
			
	}
}
