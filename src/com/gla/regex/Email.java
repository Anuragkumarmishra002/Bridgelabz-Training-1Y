package com.gla.regex;
import java.util.regex.*;
public class Email {
    public static void main(String[] args) {
        String text = "Contact: test@gmail.com and admin@yahoo.com";
        Pattern p = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}