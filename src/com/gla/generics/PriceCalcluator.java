package com.gla.generics;
class PriceCalculator {
    static class Product {
        double price;
        Product(double p) { price = p; }
        double getPrice() { return price; }
    }
    static class Mobile extends Product { Mobile(double p) { super(p); } }

    static double calculateTotal(java.util.List<? extends Product> list) {
        double total = 0;
        for (Product p : list) total += p.getPrice();
        return total;
    }

    public static void main(String[] args) {
        java.util.List<Mobile> list = java.util.Arrays.asList(new Mobile(10000));
        System.out.println(calculateTotal(list));
    }
}