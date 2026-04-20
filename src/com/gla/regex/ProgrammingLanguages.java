package com.gla.regex;
import java.util.regex.*;
public class ProgrammingLanguages {
    public static void main(String[] args) {
        String text = "I love Java and Python but not Go";
        Pattern p = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}