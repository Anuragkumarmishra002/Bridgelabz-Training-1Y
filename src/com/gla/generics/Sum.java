package com.gla.generics;

class SumDemo {
    public static double sumNumbers(java.util.List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        java.util.List<Integer> list = java.util.Arrays.asList(1,2,3);
        System.out.println(sumNumbers(list));
    }
}
