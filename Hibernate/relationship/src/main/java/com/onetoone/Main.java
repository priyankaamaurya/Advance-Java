package com.onetoone;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {

        // Create EntityManagerFactory and EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
        EntityManager em = emf.createEntityManager();

        try {
            // Create objects
            Passport passport = new Passport("P123456");
            Person person = new Person("Priyanka", passport);

            // Persist objects
            em.getTransaction().begin();
            em.persist(person); // passport auto persisted due to cascade
            em.getTransaction().commit();

            System.out.println("Saved Person with Passport using EntityManager!");

        } finally {
            em.close();
            emf.close();
        }
    }
}



