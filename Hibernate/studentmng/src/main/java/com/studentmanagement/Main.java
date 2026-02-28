package com.studentmanagement;

public class Main {

    public static void main(String[] args) {

        StudentDao dao = new StudentDao();

        // 🔹 CREATE STUDENT
        Student s = new Student();
        s.setStudentId(1101);
        s.setStudentName("Rahul");
        s.setStudentClass(10);
        s.setStudentage(15);

        // 🔹 SAVE
        dao.save(s);
        System.out.println("Student Saved");

        // 🔹 FIND
        Student st = dao.find(1101);
        System.out.println("Name: " + st.getStudentName());
        System.out.println("Class: " + st.getStudentClass());
        System.out.println("Age: " + st.getStudentage());

        // 🔹 UPDATE
        st.setStudentClass(11);
        dao.update(st);
        System.out.println("Student Updated");

        // 🔹 DELETE
//        dao.delete(1101);
//        System.out.println("Student Deleted");
    }
}
