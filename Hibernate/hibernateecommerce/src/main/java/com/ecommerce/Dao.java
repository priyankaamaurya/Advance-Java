package com.ecommerce;

import javax.persistence.*;

public class Dao {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // 🔹 SAVE
    public Orderr save(Orderr order) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(order);
        et.commit();

        em.close();
        return order;
    }

    // 🔹 FIND
    public Orderr find(int orderId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Orderr order = em.find(Orderr.class, orderId);
        et.commit();

        em.close();
        return order;
    }

    // 🔹 UPDATE
    public Orderr update(Orderr order) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Orderr updatedOrder = em.merge(order);
        et.commit();

        em.close();
        return updatedOrder;
    }

    // 🔹 DELETE
    public void delete(int orderId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Orderr order = em.find(Orderr.class, orderId);
        if (order != null) {
            em.remove(order);
        }
        et.commit();

        em.close();
    }
}

