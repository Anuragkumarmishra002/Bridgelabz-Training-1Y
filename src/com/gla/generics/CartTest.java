package com.gla.generics;
class CartTest {
    static class Cart<T> {
        java.util.List<T> items = new java.util.ArrayList<>();
        void addItem(T item) { items.add(item); }
        void display() { for (T i : items) System.out.println(i); }
    }

    public static void main(String[] args) {
        Cart<String> cart = new Cart<>();
        cart.addItem("Laptop");
        cart.display();
    }
}