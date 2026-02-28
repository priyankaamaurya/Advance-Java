package com.hotel;

import javax.persistence.*;

public class HotelDao {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // 🔹 SAVE HOTEL
    public Hotel save(Hotel hotel) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(hotel);
        et.commit();

        em.close();
        return hotel;
    }

    // 🔹 FIND HOTEL BY ID
    public Hotel find(int hotelId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Hotel hotel = em.find(Hotel.class, hotelId);
        et.commit();

        em.close();
        return hotel;
    }

    // 🔹 UPDATE HOTEL
    public Hotel update(Hotel hotel) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Hotel updatedHotel = em.merge(hotel);
        et.commit();

        em.close();
        return updatedHotel;
    }

    // 🔹 DELETE HOTEL
    public void delete(int hotelId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Hotel hotel = em.find(Hotel.class, hotelId);
        if (hotel != null) {
            em.remove(hotel);
        }
        et.commit();

        em.close();
    }
}
