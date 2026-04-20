package com.gla.regex;
public class CensorWords {
    public static void main(String[] args) {
        String text = "This is a damn stupid example";
        String[] badWords = {"damn", "stupid"};
        for (String word : badWords) {
            text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
        }
        System.out.println(text);
    }
}