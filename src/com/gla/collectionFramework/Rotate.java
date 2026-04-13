package com.gla.collectionFramework;
import java.util.*;

class Rotate {
    public static <T> void rotate(List<T> list, int k) {
        int n = list.size();
        k = k % n;

        List<T> temp = new ArrayList<>(list.subList(0, k));
        list.subList(0, k).clear();
        list.addAll(temp);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        rotate(list, 2);
        System.out.println(list);
    }
}