package com.gla.regex;
public class ValidateIP {
    public static void main(String[] args) {
        String ip = "192.168.1.1";
        System.out.println(ip.matches(
                "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}" +
                        "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$"));
    }
}