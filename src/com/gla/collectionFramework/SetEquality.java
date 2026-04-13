package com.gla.collectionFramework;
import java.util.*;
class SetEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        System.out.print("Enter size of set1");
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) s1.add(sc.nextInt());
        System.out.print("Enter size of set2 ");
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) s2.add(sc.nextInt());
        System.out.println("Equal " + s1.equals(s2));
    }
}