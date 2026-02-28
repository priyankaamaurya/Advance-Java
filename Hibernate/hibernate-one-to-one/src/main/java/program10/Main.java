package program10;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		IFSC ifsc = new IFSC();
		ifsc.setBankCode("SBIN");
		ifsc.setBranchCode(1234);
		
		Bank bank= new Bank();
		bank.setBankName("SBI");
		bank.setCity("Gurgaon");
		bank.setIfsc(ifsc);
		
		em.persist(bank);
		em.getTransaction().commit();
	}
} 
