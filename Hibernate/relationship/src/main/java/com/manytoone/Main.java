package com.manytoone;

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
	        
	        Product p1=new Product(115, "Refrigerator", c1);
	        Product p2=new Product(116, "PCs", c1);
	        Product p3=new Product(117, "Keyboard", c1);
	        Product p4=new Product(118, "Watch", c1);
	        
	        List<Product> a1=new ArrayList<Product>();
	        a1.add(p1);
	        a1.add(p2);
	        a1.add(p3);
	        a1.add(p4);
	        
	        c1.setProducts(a1);
	        
	        et.begin();
	        em.merge(c1);                               
	        et.commit();
	        
	        Customer customer = em.find(Customer.class, 1);
	        
	        Product p = em.find(Product.class, 115);
	        
	 }

}









