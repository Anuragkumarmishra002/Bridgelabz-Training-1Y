package com.gla.generics;
class FruitDemo {
    static class Fruit { void show() { System.out.println("Fruit"); } }
    static class Apple extends Fruit { void show() { System.out.println("Apple"); } }
    static class Mango extends Fruit { void show() { System.out.println("Mango"); } }

    static class FruitBox<T extends Fruit> {
        java.util.List<T> list = new java.util.ArrayList<>();
        void add(T f) { list.add(f); }
        void display() { for (T f : list) f.show(); }
    }

    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.add(new Apple());
        box.display();
    }
}


