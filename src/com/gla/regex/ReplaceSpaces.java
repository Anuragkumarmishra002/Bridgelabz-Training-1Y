package com.gla.regex;
public class ReplaceSpaces {
    public static void main(String[] args) {
        String text = "This   is   a   test";
        text = text.replaceAll("\\s+", " ");
        System.out.println(text);
    }
}