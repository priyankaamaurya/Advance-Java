package com.onlineexam;

import javax.persistence.*;

public class OnlineDao {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // 🔹 SAVE EXAM
    public Exam save(Exam exam) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(exam);
        et.commit();

        em.close();
        return exam;
    }

    // 🔹 FIND EXAM BY ID
    public Exam find(int examId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Exam exam = em.find(Exam.class, examId);
        et.commit();

        em.close();
        return exam;
    }

    // 🔹 UPDATE EXAM
    public Exam update(Exam exam) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Exam updatedExam = em.merge(exam);
        et.commit();

        em.close();
        return updatedExam;
    }

    // 🔹 DELETE EXAM
    public void delete(int examId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Exam exam = em.find(Exam.class, examId);
        if (exam != null) {
            em.remove(exam);
        }
        et.commit();

        em.close();
    }
}
