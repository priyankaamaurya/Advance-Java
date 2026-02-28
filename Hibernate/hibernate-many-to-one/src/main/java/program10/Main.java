package program10;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Blog blog = new Blog("Learning Java Basics", 2025);
		
		Comments c1 = new Comments("Very helpful explanation!", 25700, blog);
		Comments c2 = new Comments("Nice and easy to understand", 30700, blog);
		Comments c3 = new Comments("Great Blog, very informative", 15600, blog);
	
		blog.setComment(Arrays.asList(c1, c2, c3));
		
		em.persist(blog);
		em.getTransaction().commit();
		
	}
}
