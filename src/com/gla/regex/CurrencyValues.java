package com.gla.regex;
import java.util.regex.*;
public class CurrencyValues {
    public static void main(String[] args) {
        String text = "Items cost Rs 10.50 and 20.00";
        Pattern p = Pattern.compile("\\$?\\d+(\\.\\d{2})?");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}