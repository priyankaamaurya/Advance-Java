package com.hospital;

import javax.persistence.*;

public class DoctorDao {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // 🔹 SAVE DOCTOR
    public Doctor save(Doctor doctor) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(doctor);
        et.commit();

        em.close();
        return doctor;
    }

    // 🔹 FIND DOCTOR BY ID
    public Doctor find(int doctorId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Doctor doctor = em.find(Doctor.class, doctorId);
        et.commit();

        em.close();
        return doctor;
    }

    // 🔹 UPDATE DOCTOR
    public Doctor update(Doctor doctor) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Doctor updatedDoctor = em.merge(doctor);
        et.commit();

        em.close();
        return updatedDoctor;
    }

    // 🔹 DELETE DOCTOR
    public void delete(int doctorId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Doctor doctor = em.find(Doctor.class, doctorId);
        if (doctor != null) {
            em.remove(doctor);
        }
        et.commit();

        em.close();
    }
}
