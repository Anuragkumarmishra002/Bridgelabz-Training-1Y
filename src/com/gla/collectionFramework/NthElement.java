package com.gla.collectionFramework;
import java.util.*;

class NthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size ");
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) list.add(sc.nextInt());

        System.out.print("Enter N");
        int k = sc.nextInt();

        int index = list.size() - k;
        System.out.println("Nth from end" + list.get(index));
    }
}