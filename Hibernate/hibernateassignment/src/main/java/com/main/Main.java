package com.main;

import java.util.List;

import com.assign.dao.StudentDAO;
import com.assignment.Student;

public class Main {

	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAO();
		
		// STEP 1: INSERT DATA (RUN ONCE)
		// dao.insertData();
		
	    // STEP 2: CALL ALL 20 QUERIES
		System.out.println("\n1️⃣ Fetch All Students");
        dao.getAllStudents()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n2️⃣ Name and Department");
        dao.getNameAndDepartment()
           .forEach(o -> System.out.println(o[0]));

        System.out.println("\n3️⃣ Age > 20");
        dao.ageGreaterThan20()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n4️⃣ Computer Science Department");
        dao.fromCSDepartment()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n5️⃣ Students from Bangalore");
        dao.fromBangalore()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n6️⃣ Marks > 75");
        dao.marksGreaterThan75()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n7️⃣ Female Students");
        dao.femaleStudents()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n8️⃣ Admitted After 2023");
        dao.admittedAfter2023()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n9️⃣ Name Starts With A");
        dao.nameStartsWithA()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n🔟 Name Contains 'an'");
        dao.nameContainsAn()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n1️⃣1️⃣ Marks Between 60 & 80");
        dao.marksBetween60And80()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n1️⃣2️⃣ Age Not 22");
        dao.ageNot22()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n1️⃣3️⃣ Not From Delhi");
        dao.notFromDelhi()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n1️⃣4️⃣ Sort By Marks Desc");
        dao.sortByMarksDesc()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n1️⃣5️⃣ Top 3 Students");
        dao.top3Students()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n1️⃣6️⃣ Order By Admission Date");
        dao.orderByAdmissionDate()
           .forEach(s -> System.out.println(s.getName()));

        System.out.println("\n1️⃣7️⃣ Total Students");
        System.out.println(dao.countStudents());

        System.out.println("\n1️⃣8️⃣ Average Marks");
        System.out.println(dao.averageMarks());

        System.out.println("\n1️⃣9️⃣ Maximum Marks");
        System.out.println(dao.maxMarks());

        System.out.println("\n2️⃣0️⃣ Count By Department");
        dao.countByDepartment()
           .forEach(o -> System.out.println(o[0] + " -> " + o[1]));
		
	}
}
