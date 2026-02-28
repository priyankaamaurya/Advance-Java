package com.assign.dao;

import javax.persistence.EntityManager;

import com.assignment.Student;
import com.util.JPAUtil;

import java.time.LocalDate;
import java.util.List;

public class StudentDAO {

//	Insert Data
	
    public void insertData() {

        EntityManager em = JPAUtil.getEntityManagerFactory()
                                  .createEntityManager();

        em.getTransaction().begin();

        Student s1 = new Student();
        s1.setName("Aman");
        s1.setAge(21);
        s1.setDepartment("Computer Science");
        s1.setCity("Delhi");
        s1.setMarks(85);
        s1.setGender("Male");
        s1.setAdmissionDate(LocalDate.of(2023, 2, 10));

        Student s2 = new Student();
        s2.setName("Anjali");
        s2.setAge(20);
        s2.setDepartment("IT");
        s2.setCity("Bangalore");
        s2.setMarks(72);
        s2.setGender("Female");
        s2.setAdmissionDate(LocalDate.of(2022, 8, 5));

        Student s3 = new Student();
        s3.setName("Rohan");
        s3.setAge(22);
        s3.setDepartment("Computer Science");
        s3.setCity("Mumbai");
        s3.setMarks(90);
        s3.setGender("Male");
        s3.setAdmissionDate(LocalDate.of(2023, 1, 15));

        Student s4 = new Student();
        s4.setName("Aditi");
        s4.setAge(19);
        s4.setDepartment("ECE");
        s4.setCity("Delhi");
        s4.setMarks(65);
        s4.setGender("Female");
        s4.setAdmissionDate(LocalDate.of(2024, 3, 1));

        Student s5 = new Student();
        s5.setName("Suman");
        s5.setAge(23);
        s5.setDepartment("Mechanical");
        s5.setCity("Chennai");
        s5.setMarks(78);
        s5.setGender("Male");
        s5.setAdmissionDate(LocalDate.of(2021, 7, 12));

        Student s6 = new Student();
        s6.setName("Neha");
        s6.setAge(21);
        s6.setDepartment("IT");
        s6.setCity("Delhi");
        s6.setMarks(88);
        s6.setGender("Female");
        s6.setAdmissionDate(LocalDate.of(2023, 5, 20));

        Student s7 = new Student();
        s7.setName("Karan");
        s7.setAge(24);
        s7.setDepartment("Civil");
        s7.setCity("Pune");
        s7.setMarks(55);
        s7.setGender("Male");
        s7.setAdmissionDate(LocalDate.of(2020, 6, 18));

        Student s8 = new Student();
        s8.setName("Pooja");
        s8.setAge(20);
        s8.setDepartment("Computer Science");
        s8.setCity("Bangalore");
        s8.setMarks(92);
        s8.setGender("Female");
        s8.setAdmissionDate(LocalDate.of(2023, 4, 25));

        Student s9 = new Student();
        s9.setName("Rahul");
        s9.setAge(22);
        s9.setDepartment("ECE");
        s9.setCity("Hyderabad");
        s9.setMarks(70);
        s9.setGender("Male");
        s9.setAdmissionDate(LocalDate.of(2022, 11, 30));

        Student s10 = new Student();
        s10.setName("Sneha");
        s10.setAge(19);
        s10.setDepartment("IT");
        s10.setCity("Mumbai");
        s10.setMarks(81);
        s10.setGender("Female");
        s10.setAdmissionDate(LocalDate.of(2024, 1, 10));

        Student s11 = new Student();
        s11.setName("Arjun");
        s11.setAge(23);
        s11.setDepartment("Mechanical");
        s11.setCity("Delhi");
        s11.setMarks(60);
        s11.setGender("Male");
        s11.setAdmissionDate(LocalDate.of(2021, 9, 14));

        Student s12 = new Student();
        s12.setName("Kavita");
        s12.setAge(21);
        s12.setDepartment("Civil");
        s12.setCity("Jaipur");
        s12.setMarks(75);
        s12.setGender("Female");
        s12.setAdmissionDate(LocalDate.of(2022, 2, 5));

        Student s13 = new Student();
        s13.setName("Nikhil");
        s13.setAge(20);
        s13.setDepartment("Computer Science");
        s13.setCity("Noida");
        s13.setMarks(95);
        s13.setGender("Male");
        s13.setAdmissionDate(LocalDate.of(2023, 6, 12));

        Student s14 = new Student();
        s14.setName("Priya");
        s14.setAge(22);
        s14.setDepartment("ECE");
        s14.setCity("Bhopal");
        s14.setMarks(68);
        s14.setGender("Female");
        s14.setAdmissionDate(LocalDate.of(2021, 12, 8));

        Student s15 = new Student();
        s15.setName("Sahil");
        s15.setAge(24);
        s15.setDepartment("IT");
        s15.setCity("Gurgaon");
        s15.setMarks(82);
        s15.setGender("Male");
        s15.setAdmissionDate(LocalDate.of(2020, 10, 19));

        em.persist(s1);
        em.persist(s2);
        em.persist(s3);
        em.persist(s4);
        em.persist(s5);
        em.persist(s6);
        em.persist(s7);
        em.persist(s8);
        em.persist(s9);
        em.persist(s10);
        em.persist(s11);
        em.persist(s12);
        em.persist(s13);
        em.persist(s14);
        em.persist(s15);

        em.getTransaction().commit();
        em.close();

        System.out.println("✅ 15 Student Records Inserted Successfully");
    }


    //  All 20 Query methods

    // 1. Fetch all students
    public List<Student> getAllStudents() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student", Student.class).getResultList();
    }

    // 2. Name and department
    public List<Object[]> getNameAndDepartment() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("select s.name, s.department from Student s").getResultList();
    }

    // 3. Age > 20
    public List<Student> ageGreaterThan20() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s where s.age > 20", Student.class).getResultList();
    }

    // 4. Computer Science department
    public List<Student> fromCSDepartment() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s where s.department='Computer Science'", Student.class).getResultList();
    }

    // 5. Students from Bangalore
    public List<Student> fromBangalore() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s where s.city='Bangalore'", Student.class).getResultList();
    }

    // 6. Marks > 75
    public List<Student> marksGreaterThan75() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s where s.marks>75", Student.class).getResultList();
    }

    // 7. Female students
    public List<Student> femaleStudents() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s where s.gender='Female'", Student.class).getResultList();
    }

    // 8. Admission after 2023-01-01
    public List<Student> admittedAfter2023() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s where s.admissionDate>:date", Student.class)
                 .setParameter("date", LocalDate.of(2023,1,1))
                 .getResultList();
    }

    // 9. Name starts with A
    public List<Student> nameStartsWithA() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s where s.name like 'A%'", Student.class).getResultList();
    }

    // 10. Name contains 'an'
    public List<Student> nameContainsAn() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s where s.name like '%an%'", Student.class).getResultList();
    }

    // 11. Marks between 60 and 80
    public List<Student> marksBetween60And80() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s where s.marks between 60 and 80", Student.class).getResultList();
    }

    // 12. Age not 22
    public List<Student> ageNot22() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s where s.age<>22", Student.class).getResultList();
    }

    // 13. Not from Delhi
    public List<Student> notFromDelhi() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s where s.city<>'Delhi'", Student.class).getResultList();
    }

    // 14. Sort by marks descending
    public List<Student> sortByMarksDesc() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s order by s.marks desc", Student.class).getResultList();
    }

    // 15. Top 3 students
    public List<Student> top3Students() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s order by s.marks desc", Student.class)
                 .setMaxResults(3)
                 .getResultList();
    }

    // 16. Order by admission date
    public List<Student> orderByAdmissionDate() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("from Student s order by s.admissionDate asc", Student.class).getResultList();
    }

    // 17. Total students count
    public Long countStudents() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("select count(s) from Student s", Long.class).getSingleResult();
    }

    // 18. Average marks
    public Double averageMarks() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("select avg(s.marks) from Student s", Double.class).getSingleResult();
    }

    // 19. Maximum marks
    public Integer maxMarks() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("select max(s.marks) from Student s", Integer.class).getSingleResult();
    }

    // 20. Count students by department
    public List<Object[]> countByDepartment() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("select s.department, count(s) from Student s group by s.department").getResultList();
    }

}
