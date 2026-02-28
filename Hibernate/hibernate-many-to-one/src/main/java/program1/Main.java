package program1;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Class cls= new Class(101, "BCA 3rd year");
		
		Students s1 = new Students(1,"Amit", cls);
		Students s2 = new Students(2,"Neha", cls);
		Students s3 = new Students(3,"Gaurav", cls);
		
		cls.setStudents(Arrays.asList(s1, s2, s3));
		
		em.persist(cls);
		em.getTransaction().commit();
			
	}
}
