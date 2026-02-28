package com.hibernateuser;

public class Main {

    public static void main(String[] args) {

        UserDao dao = new UserDao();

        // 🔹 CREATE USER
        User user = new User();
        user.setUserId(1001);
        user.setUserName("Priyanka");
        user.setUserEmail("priyanka@gmail.com");
        user.setUserPassword("pass123");

        // 🔹 SAVE
        dao.save(user);
        System.out.println("User Saved");

        // 🔹 FIND
        User u = dao.find(1001);
        System.out.println("Name: " + u.getUserName());
        System.out.println("Email: " + u.getUserEmail());

        // 🔹 UPDATE
        u.setUserPassword("newpass456");
        dao.update(u);
        System.out.println("User Updated");

        // 🔹 DELETE
//        dao.delete(1001);
//        System.out.println("User Deleted");
    }
}
