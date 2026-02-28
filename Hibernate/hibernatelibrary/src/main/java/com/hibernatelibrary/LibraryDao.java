package com.hibernatelibrary;

import javax.persistence.*;

public class LibraryDao {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // 🔹 SAVE LIBRARY
    public Library save(Library library) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(library);
        et.commit();

        em.close();
        return library;
    }

    // 🔹 FIND LIBRARY BY ID
    public Library find(int libraryId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Library library = em.find(Library.class, libraryId);
        et.commit();

        em.close();
        return library;
    }

    // 🔹 UPDATE LIBRARY
    public Library update(Library library) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Library updatedLibrary = em.merge(library);
        et.commit();

        em.close();
        return updatedLibrary;
    }

    // 🔹 DELETE LIBRARY
    public void delete(int libraryId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Library library = em.find(Library.class, libraryId);
        if (library != null) {
            em.remove(library);
        }
        et.commit();

        em.close();
    }
}
