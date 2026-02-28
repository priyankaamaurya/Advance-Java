package qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		//System.out.println(emf);
		
		EntityManager entityManager = emf.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = entityManager.find(Person.class, 11);
		
		if(person!=null) {
			System.out.println(person);
		}
	}
}
