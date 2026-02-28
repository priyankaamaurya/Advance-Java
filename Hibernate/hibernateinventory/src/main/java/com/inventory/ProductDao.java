package com.inventory;

import javax.persistence.*;

public class ProductDao {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // 🔹 SAVE PRODUCT
    public Product save(Product product) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(product);
        et.commit();

        em.close();
        return product;
    }

    // 🔹 FIND PRODUCT BY ID
    public Product find(int productId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Product product = em.find(Product.class, productId);
        et.commit();

        em.close();
        return product;
    }

    // 🔹 UPDATE PRODUCT
    public Product update(Product product) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Product updatedProduct = em.merge(product);
        et.commit();

        em.close();
        return updatedProduct;
    }

    // 🔹 DELETE PRODUCT
    public void delete(int productId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Product product = em.find(Product.class, productId);
        if (product != null) {
            em.remove(product);
        }
        et.commit();

        em.close();
    }
}
