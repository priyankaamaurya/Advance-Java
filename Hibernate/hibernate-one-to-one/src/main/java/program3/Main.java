package program3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		IDCard idcard = new IDCard();
		idcard.setDob("24/7/2003");
		idcard.setPhoneNo(9826554867l);
		
		Student student = new Student();
		student.setStudentId(111);
		student.setStudentName("Kartik");
		student.setIdcard(idcard);
		
		em.persist(student);
		em.getTransaction().commit();
				
	}
}
