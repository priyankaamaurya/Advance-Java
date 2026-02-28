package com.banking;

import javax.persistence.*;

public class DAO {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // 🔹 SAVE ACCOUNT
    public Account save(Account account) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(account);
        et.commit();

        em.close();
        return account;
    }

    // 🔹 FIND ACCOUNT BY ACCOUNT NUMBER
    public Account find(int accountNumber) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Account account =
                em.find(Account.class, accountNumber);
        et.commit();

        em.close();
        return account;
    }

    // 🔹 UPDATE ACCOUNT (BALANCE / NAME / TYPE)
    public Account update(Account account) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Account updatedAccount = em.merge(account);
        et.commit();

        em.close();
        return updatedAccount;
    }

    // 🔹 DELETE ACCOUNT
    public void delete(int accountNumber) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Account account =
                em.find(Account.class, accountNumber);
        if (account != null) {
            em.remove(account);
        }
        et.commit();

        em.close();
    }

    // 🔹 CHECK ENTITY STATE
    public boolean contains(Account account) {
        EntityManager em = emf.createEntityManager();
        boolean result = em.contains(account);
        em.close();
        return result;
    }

    // 🔹 DETACH ENTITY
    public void detach(Account account) {
        EntityManager em = emf.createEntityManager();
        em.detach(account);
        em.close();
    }

    // 🔹 CLEAR PERSISTENCE CONTEXT
    public void clear() {
        EntityManager em = emf.createEntityManager();
        em.clear();
        em.close();
    }
}