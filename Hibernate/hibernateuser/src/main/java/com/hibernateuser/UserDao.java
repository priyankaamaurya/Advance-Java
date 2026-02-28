package com.hibernateuser;

import javax.persistence.*;

public class UserDao {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // 🔹 SAVE USER
    public User save(User user) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(user);
        et.commit();

        em.close();
        return user;
    }

    // 🔹 FIND USER BY ID
    public User find(int userId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        User user = em.find(User.class, userId);
        et.commit();

        em.close();
        return user;
    }

    // 🔹 UPDATE USER
    public User update(User user) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        User updatedUser = em.merge(user);
        et.commit();

        em.close();
        return updatedUser;
    }

    // 🔹 DELETE USER
    public void delete(int userId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        User user = em.find(User.class, userId);
        if (user != null) {
            em.remove(user);
        }
        et.commit();

        em.close();
    }
}
