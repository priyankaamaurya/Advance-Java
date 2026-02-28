package com.inventory;

public class Main {

    public static void main(String[] args) {

        ProductDao dao = new ProductDao();

        // 🔹 CREATE PRODUCT
        Product p = new Product();
        p.setProductId(701);
        p.setProductName("Laptop");
        p.setProductPrice(55000.0f);
        p.setProductQuality("Excellent");

        // 🔹 SAVE
        dao.save(p);
        System.out.println("Product Saved");

        // 🔹 FIND
        Product prod = dao.find(701);
        System.out.println("Name: " + prod.getProductName());
        System.out.println("Price: " + prod.getProductPrice());
        System.out.println("Quality: " + prod.getProductQuality());

        // 🔹 UPDATE
        prod.setProductPrice(58000.0f);
        dao.update(prod);
        System.out.println("Product Updated");

        // 🔹 DELETE
//        dao.delete(701);
//        System.out.println("Product Deleted");
    }
}
