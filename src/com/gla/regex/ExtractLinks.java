package com.gla.regex;
import java.util.regex.*;
public class ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://google.com and http://chrome.com";
        Pattern p = Pattern.compile("https?://[^\\s]+");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}