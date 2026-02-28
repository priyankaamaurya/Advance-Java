package qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Second {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		System.out.println(emf);
		
		EntityManager entityManager = emf.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person p = new Person();
		p.setId(12);
		p.setName("Priya");
		p.setAge(22);
		p.setDob("25/07/2005");
		
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit()
;	}
}
