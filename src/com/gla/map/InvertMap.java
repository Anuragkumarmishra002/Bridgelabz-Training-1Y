package com.gla.map;
import java.util.*;
class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        Map<Integer, List<String>> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                    .add(entry.getKey());
        }
        System.out.println(result);
    }
}