package program9;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		ISBN isbn = new ISBN();
		isbn.setCountryCode(978);	
		isbn.setBookCode(86754);
		
		Book book= new Book();
		book.setBookId(101);
		book.setBookAuthor("R. K. Narayan");
		book.setIsbn(isbn);
		
		em.persist(book);
		em.getTransaction().commit();
		
	}
}
