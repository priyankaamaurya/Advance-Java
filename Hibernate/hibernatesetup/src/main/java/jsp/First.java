package jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class First {
	
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=
			Persistence.createEntityManagerFactory("java");
	System.out.println(entityManagerFactory);
			
	EntityManager em = entityManagerFactory.createEntityManager();
	
	EntityTransaction et = em.getTransaction();
	
}
}
