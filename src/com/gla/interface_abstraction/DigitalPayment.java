package com.gla.interface_abstraction;
public class DigitalPayment {

    interface Payment {
        void pay(double amount);
    }
    static class UPI implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " +amount+ " via UPI");
        }
    }
    static class CreditCard implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " +amount+ " via Credit Card");
        }
    }
    static class Wallet implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " +amount+ " via Wallet");
        }
    }
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();
        upi.pay(300);
        card.pay(1000);
        wallet.pay(561);
    }
}