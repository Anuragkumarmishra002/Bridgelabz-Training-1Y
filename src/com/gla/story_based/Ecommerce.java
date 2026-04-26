package com.gla.story_based;

class Product {
    int productId;
    String productName;

    Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    boolean isMatch(String keyword) {

        return productName.toLowerCase().contains(keyword.toLowerCase());
    }

    void display() {
        System.out.println("Product ID   = " + productId);
        System.out.println("Product Name = " + productName);
    }
}

class ElectronicProduct extends Product {
    String brand;

    ElectronicProduct(int productId, String productName, String brand) {
        super(productId, productName);
        this.brand = brand;
    }

    @Override
    boolean isMatch(String keyword) {
        // Match against both product name and brand
        return productName.toLowerCase().contains(keyword.toLowerCase())
                || brand.equalsIgnoreCase(keyword);
    }

    @Override
    void display() {
        System.out.println("Product ID   = " + productId);
        System.out.println("Product Name = " + productName);
        System.out.println("Brand        = " + brand);
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Product p1 = new Product(401, "Wooden Chair");
        ElectronicProduct ep1 = new ElectronicProduct(402, "Wireless Headphones", "Sony");
        ElectronicProduct ep2 = new ElectronicProduct(403, "Smart TV 55 inch", "Samsung");

        System.out.println(" || Product Search || ");
        String keyword1 = "Chair";
        System.out.println("Keyword \"" + keyword1 + "\"");
        System.out.println("Match in p1 (Wooden Chair)  " + p1.isMatch(keyword1));

        System.out.println();
        String keyword2 = "Sony";
        System.out.println("Keyword \"" + keyword2 + "\"");
        System.out.println("Match in ep1 (by brand) " + ep1.isMatch(keyword2));

        System.out.println();
        String keyword3 = "TV";
        System.out.println("Keyword \"" + keyword3 + "\"");
        System.out.println("Match in ep2 (by name) " + ep2.isMatch(keyword3));

        System.out.println("\nProduct Details");
        p1.display();
        System.out.println();
        ep1.display();
        System.out.println();
        ep2.display();
    }
}
