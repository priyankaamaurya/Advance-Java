package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	
	 public static void main(String[] args) {

	        // Create EntityManagerFactory and EntityManager
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction et =em.getTransaction();
	        
	        Customer c1 = new Customer(2,"b");
	        
	        Product p1=new Product(105, "Refrigerator");
	        Product p2=new Product(106, "PCs");
	        Product p3=new Product(107, "Keyboard");
	        Product p4=new Product(108, "Watch");
	        
	        List<Product> a1=new ArrayList<Product>();
	        a1.add(p1);
	        a1.add(p2);
	        a1.add(p3);
	        a1.add(p4);
	        
	        c1.setProducts(a1);
	        
//	        et.begin();
//	        em.persist(p1);
//	        em.persist(p2);
//	        em.persist(p3);
//	        em.persist(p4);
//	        em.merge(c2);
//	        em.persist(c2);
//	        et.commit();       
	        
	        //cascading
	        
	        et.begin();
	        em.merge(c1);                               
	        et.commit();
	        
//	        types of fetching are 1. Eager and 2. Lazy
	        
//	        by default fetch type for eager
//	        one to one and many to one
	        
//	        by default fetch type for lazy
//	        one to many and many to many
	 }

}



