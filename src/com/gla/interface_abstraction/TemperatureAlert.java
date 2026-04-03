package com.gla.interface_abstraction;
import java.util.function.Predicate;

public class TemperatureAlert{
    public static void main(String[] args) {
        double temperature = 104.5;
        double threshold = 100.0;
        Predicate<Double> alert = temp -> temp > threshold;

        if(alert.test(temperature)) {
            System.out.println("Alert Temperature has crossed threshold = " + temperature);
        } else {
            System.out.println("Temperature is normal " + temperature);
        }
    }
}