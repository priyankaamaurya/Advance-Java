package com.jsp.student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.exception.StudentNotFoundException;
import com.jspentity.Student;
import java.util.List;

public class StudentDao {

	private final EntityManagerFactory entityManagerFactory=Persistence .createEntityManagerFactory("java");
	
	public Student save(Student student) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student1 = entityManager.find(Student.class, student.getRol());
		if(student1!=null) {
			throw new StudentNotFoundException("student already registered");
			
		}
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
		return student;
	}
	
	public Student updatePassword(int rol, String password) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student = entityManager.find(Student.class, rol);
		if(student!=null) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
		return student;
	}
	else 
	{
		throw new StudentNotFoundException("student with roll no not registered");
	}
	
  }
	
	public Student find(String address) {
		EntityManager em =entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		et.begin();
		Student student = em.find(Student.class, address);
		if(student!=null) {
		et.begin();
		em.persist(student);	
//		et.commit();
		return student;
	}
	else 
	{
		throw new StudentNotFoundException("student with address not registered");
	}	
  }
	
	public void findAll() {
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		
		String q2 = "select s from Student s";
		
//		Positioned parameter
		String q ="select s from Student s where s.rol=?1 or s.name=?2";
		
		//step 3
		Query query=entityManager.createQuery(q);
		
		query.setParameter(1, 1);
		query.setParameter(2, "a");
//		
//		Named parameter
//		String q1 ="select s from Student s where s.rol=:rol or s.name=:name";
		
//		Query query=entityManager.createQuery(q);
		
//		query.setParameter("rol", 1);
//		query.setParameter("name", "hello");
		
		List<Student> l= query.getResultList();
		System.out.println(l);
	}
	
}  
