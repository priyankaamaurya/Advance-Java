package com.banking;

public class Main {

    public static void main(String[] args) {

        DAO dao = new DAO();

        // 🔹 CREATE ACCOUNT OBJECT
        Account acc = new Account();
        acc.setAccountNumber(101);
        acc.setAccountHolderName("Priyanka Maurya");
        acc.setAccountBalance(50000.0);
        acc.setAccountType("Saving");

        // 🔹 SAVE
        dao.save(acc);
        System.out.println("Account saved");

        // 🔹 FIND
        Account foundAcc = dao.find(101);
        System.out.println("Account Holder: "
                + foundAcc.getAccountHolderName());
        System.out.println("Balance: "
                + foundAcc.getAccountBalance());

        // 🔹 UPDATE
        foundAcc.setAccountBalance(80000.0);
        dao.update(foundAcc);
        System.out.println("Account updated");

        // 🔹 CHECK CONTAINS
        boolean status = dao.contains(foundAcc);
        System.out.println("Is Managed: " + status);

        // 🔹 DELETE
//        dao.delete(101);
//        System.out.println("Account deleted");
    }
}

