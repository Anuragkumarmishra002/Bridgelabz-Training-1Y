package com.gla.collectionFramework;
import java.util.*;
class ReverseQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size ");
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) q.add(sc.nextInt());
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) stack.push(q.poll());
        while (!stack.isEmpty()) q.add(stack.pop());
        System.out.println("Reversed Queue " + q);
    }
}