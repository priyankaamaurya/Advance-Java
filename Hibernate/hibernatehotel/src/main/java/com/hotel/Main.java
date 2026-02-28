package com.hotel;

public class Main {

    public static void main(String[] args) {

        HotelDao dao = new HotelDao();

        // 🔹 CREATE HOTEL
        Hotel h = new Hotel();
        h.setId(601);
        h.setName("Taj Palace");
        h.setPrice(9000);          // int accepted (your setter)
        h.setDob("Delhi");         // method name as per your class

        // 🔹 SAVE
        dao.save(h);
        System.out.println("Hotel Saved");

        // 🔹 FIND
        Hotel hotel = dao.find(601);
        System.out.println(hotel);

        // 🔹 UPDATE
        hotel.setPrice(12000);
        dao.update(hotel);
        System.out.println("Hotel Updated");

        // 🔹 DELETE
//        dao.delete(601);
//        System.out.println("Hotel Deleted");
    }
}
