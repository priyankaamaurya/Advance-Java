package com.ecommerce;

public class Main {

    public static void main(String[] args) {

        Dao dao = new Dao();

        // 🔹 CREATE ORDER
        Orderr order = new Orderr();
        order.setOrderId(301);
        order.setOrderDate("28-01-2026");
        order.setOrderAmount(4999.99);
        order.setOrderStatus("PLACED");

        // 🔹 SAVE
        dao.save(order);
        System.out.println("Order Saved");

        // 🔹 FIND
        Orderr o = dao.find(301);
        System.out.println("Amount: " + o.getOrderAmount());
        System.out.println("Status: " + o.getOrderStatus());

        // 🔹 UPDATE
        o.setOrderStatus("SHIPPED");
        dao.update(o);
        System.out.println("Order Updated");

        // 🔹 DELETE
//        dao.delete(301);
//        System.out.println("Order Deleted");
    }
}

