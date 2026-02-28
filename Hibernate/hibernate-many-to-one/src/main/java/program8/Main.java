package program8;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Bank bank = new Bank("State Bank of India","Public Sector");
		
		Accounts a1 = new Accounts(35000.0, "Savings", bank);
		Accounts a2 = new Accounts(65000.0, "Fixed Deposit", bank);
		Accounts a3 = new Accounts(25000.0, "Current", bank);
		
		bank.setAccount(Arrays.asList(a1, a2, a3));
		
		em.persist(bank);
		em.getTransaction().commit();
	}
}
