package com.gla.regex;
import java.util.regex.*;
public class CapitalizedWord {
    public static void main(String[] args) {
        String text = "This Is A Sample Text";
        Pattern p = Pattern.compile("\\b[A-Z][a-z]*\\b");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}