package com.studentmanagement;

import javax.persistence.*;

public class StudentDao {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // 🔹 SAVE STUDENT
    public Student save(Student student) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(student);
        et.commit();

        em.close();
        return student;
    }

    // 🔹 FIND STUDENT BY ID
    public Student find(int studentId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Student student = em.find(Student.class, studentId);
        et.commit();

        em.close();
        return student;
    }

    // 🔹 UPDATE STUDENT
    public Student update(Student student) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Student updatedStudent = em.merge(student);
        et.commit();

        em.close();
        return updatedStudent;
    }

    // 🔹 DELETE STUDENT
    public void delete(int studentId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Student student = em.find(Student.class, studentId);
        if (student != null) {
            em.remove(student);
        }
        et.commit();

        em.close();
    }
}
