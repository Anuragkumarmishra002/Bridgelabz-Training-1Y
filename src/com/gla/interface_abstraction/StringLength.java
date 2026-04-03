package com.gla.interface_abstraction;
import java.util.function.Function;

public class StringLength{

    public static void main(String[] args) {
        String message = "Check  The Length  ";
        int limit = 25;

        Function<String, Integer> getLength = str -> str.length();
        int length = getLength.apply(message);

        if(length > limit) {
            System.out.println("Message exceeds the limit and  Length  = " + length);
        } else {
            System.out.println("Message is within the limit and  Length = " + length);
        }
    }
}
