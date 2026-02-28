package com.employeemng;

import javax.persistence.*;

public class Dao {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // 🔹 SAVE EMPLOYEE
    public Employee save(Employee employee) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(employee);
        et.commit();

        em.close();
        return employee;
    }

    // 🔹 FIND EMPLOYEE BY ID
    public Employee find(int employeeId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Employee employee = em.find(Employee.class, employeeId);
        et.commit();

        em.close();
        return employee;
    }

    // 🔹 UPDATE EMPLOYEE
    public Employee update(Employee employee) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Employee updatedEmployee = em.merge(employee);
        et.commit();

        em.close();
        return updatedEmployee;
    }

    // 🔹 DELETE EMPLOYEE
    public void delete(int employeeId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Employee employee = em.find(Employee.class, employeeId);
        if (employee != null) {
            em.remove(employee);
        }
        et.commit();

        em.close();
    }
}
