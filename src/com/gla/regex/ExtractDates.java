package com.gla.regex;
import java.util.regex.*;
public class ExtractDates {
    public static void main(String[] args) {
        String text = "Dates: 12/05/2025 and 01/01/2026";
        Pattern p = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}