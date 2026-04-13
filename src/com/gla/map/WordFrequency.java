package com.gla.map;
import java.util.*;
class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence ");
        String input = sc.nextLine().toLowerCase();

        input = input.replaceAll("[^a-zA-Z ]", "");
        String[] words = input.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word Frequency " + map);
    }
}