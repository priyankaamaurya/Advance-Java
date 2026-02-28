package com.employeemng;

public class Main {

    public static void main(String[] args) {

        Dao dao = new Dao();

        // 🔹 CREATE EMPLOYEE
        Employee emp = new Employee();
        emp.setEmployeeId(401);
        emp.setEmployeeName("Priyanka");
        emp.setEmployeeSalary(35000.0);
        emp.setEmployeeCity("Delhi");

        // 🔹 SAVE
        dao.save(emp);
        System.out.println("Employee Saved");

        // 🔹 FIND
        Employee e = dao.find(401);
        System.out.println("Name: " + e.getEmployeeName());
        System.out.println("Salary: " + e.getEmployeeSalary());
        System.out.println("City: " + e.getEmployeeCity());

        // 🔹 UPDATE
        e.setEmployeeSalary(42000.0);
        dao.update(e);
        System.out.println("Employee Updated");

        // 🔹 DELETE
//        dao.delete(401);
//        System.out.println("Employee Deleted");
    }
}
