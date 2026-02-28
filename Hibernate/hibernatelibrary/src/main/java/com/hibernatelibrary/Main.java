package com.hibernatelibrary;

public class Main {

    public static void main(String[] args) {

        LibraryDao dao = new LibraryDao();

        // 🔹 CREATE LIBRARY
        Library lib = new Library();
        lib.setLibraryId(801);
        lib.setLibraryName("Central Library");
        lib.setTotalBooks(12000);
        lib.setLocation("New Delhi");

        // 🔹 SAVE
        dao.save(lib);
        System.out.println("Library Saved");

        // 🔹 FIND
        Library l = dao.find(801);
        System.out.println("Name: " + l.getLibraryName());
        System.out.println("Books: " + l.getTotalBooks());
        System.out.println("Location: " + l.getLocation());

        // 🔹 UPDATE
        l.setTotalBooks(15000);
        dao.update(l);
        System.out.println("Library Updated");

        // 🔹 DELETE
//        dao.delete(801);
//        System.out.println("Library Deleted");
    }
}
