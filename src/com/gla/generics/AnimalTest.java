package com.gla.generics;

class AnimalTest {
    static class Animal { void sound() { System.out.println("Animal"); } }
    static class Dog extends Animal { void sound() { System.out.println("Dog"); } }
    static class Cat extends Animal { void sound() { System.out.println("Cat"); } }
    static void printAnimals(java.util.List<? extends Animal> list) {
        for (Animal a : list) a.sound();
    }
    public static void main(String[] args) {
        java.util.List<Dog> dogs = java.util.Arrays.asList(new Dog());
        printAnimals(dogs);
    }
}