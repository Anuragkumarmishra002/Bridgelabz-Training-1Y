package com.gla.interface_abstraction;


public class PaymentGateway {
    interface PaymentProcessor {
        void pay(double amount);

        default void refund(double amount) {
            System.out.println("Refund of " + amount + " processed");
        }
    }

    static class GooglePay implements PaymentProcessor {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via GooglePay");
        }
    }

    static class PhonePAY implements PaymentProcessor {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via PhonePay");
        }

        public void refund(double amount) {
            System.out.println("PhonePay  instant refund " + amount);
        }
    }

    static class Paytm implements PaymentProcessor {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via PayTm");
        }
    }

    public static void main(String[] args) {
        PaymentProcessor googlePay = new GooglePay();
        PaymentProcessor phonePay = new PhonePAY();
        PaymentProcessor paytm = new Paytm();

        googlePay.pay(1000);
        phonePay.pay(500);
        paytm.pay(400);

        System.out.println();

        googlePay.refund(200);      // Uses default
        phonePay.refund(300);      // Uses overridden
        paytm.refund(150);        // Uses default
    }
}