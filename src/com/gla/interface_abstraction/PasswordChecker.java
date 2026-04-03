package com.gla.interface_abstraction;


interface SecurityUtils {
    static boolean isStrong(String password) {
        return password.length() >= 8;
    }
}

public class PasswordChecker{
    public static void main(String[] args) {
        String pwd1 = "Pass123";
        String pwd2 = "StrongPass123";

        System.out.println(pwd1 + " is strong: " + SecurityUtils.isStrong(pwd1));
        System.out.println(pwd2 + " is strong: " + SecurityUtils.isStrong(pwd2));
    }
}