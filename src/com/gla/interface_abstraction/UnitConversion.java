package com.gla.interface_abstraction;


interface ConversionUtils {
    static double kmToMiles(double km) {
        return km * 0.621;
    }

    static double kgToLbs(double kg) {
        return kg * 2.205;
    }
}

public class UnitConversion {
    public static void main(String[] args) {
        double km = 400;
        double kg = 20;

        System.out.println(km + " km = " + ConversionUtils.kmToMiles(km) + " miles");
        System.out.println(kg + " kg = " + ConversionUtils.kgToLbs(kg) + " lbs");
    }
}