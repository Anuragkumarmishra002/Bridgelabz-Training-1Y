package com.gla.interface_abstraction;
public class Clone {
    static class Product implements Cloneable {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
        void display() {
            System.out.println(name + " price = " + price);
        }
    }

    public static void main(String[] args) {
        try {
            Product original = new Product("Laptop", 80000);
            Product clone1 = (Product) original.clone();
            Product clone2 = (Product) original.clone();

            clone1.price = 55000;
            clone2.price = 48000;

            System.out.println("Original:");
            original.display();

            System.out.println("\nClone 1:");
            clone1.display();

            System.out.println("\nClone 2:");
            clone2.display();

        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failed");
        }
    }
}