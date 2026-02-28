package com.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	    private static EntityManagerFactory emf =
	            Persistence.createEntityManagerFactory("java");

	    public static EntityManagerFactory getEntityManagerFactory() {
	        return emf;
	    }
	}
