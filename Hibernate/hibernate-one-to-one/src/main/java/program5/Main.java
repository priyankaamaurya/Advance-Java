package program5;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		VoterID voterid = new VoterID();
		voterid.setIssueDate("14/08/2025");
		voterid.setIssueState("Uttar Pradesh");
		
		Voter voter = new Voter();
		voter.setVoterName("Abhishek");
		voter.setCity("Pratapgarh");
		voter.setVoterid(voterid);
	
		em.persist(voter);
		em.getTransaction().commit();
	}
}
