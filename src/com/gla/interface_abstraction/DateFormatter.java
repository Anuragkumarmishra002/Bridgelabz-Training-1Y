package com.gla.interface_abstraction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
interface DateUtils {
    static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}
public class DateFormatter {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Standard  || " + DateUtils.formatDate(today, "dd/MM/yyyy"));
        System.out.println("US || " + DateUtils.formatDate(today, "MM/dd/yyyy"));
        System.out.println("Long || " + DateUtils.formatDate(today, "dd MMMM yyyy"));
    }
}