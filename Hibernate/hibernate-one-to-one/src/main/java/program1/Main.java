package program1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		System.out.println("Transaction started");
		
		Profile profile = new Profile();
		profile.setProfileId(101);
		profile.setBio("Java Developer");
		
		User user = new User();
		user.setUserId(1);
		user.setName("Priyanka");
		user.setProfile(profile);
		
		em.persist(user);
		em.getTransaction().commit();
		System.out.println("Data inserted successfully");
	}
}
