package com.gla.story_based;

class Order {
    int orderId;
    double baseAmount;
    static double deliveryCharge = 40;

    Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }
    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
    void display() {
        System.out.println("Order ID        = " + orderId);
        System.out.println("Base Amount     = ₹" + baseAmount);
        System.out.println("Delivery Charge = ₹" + deliveryCharge);
        System.out.println("Total Bill      = ₹" + calculateBill());
    }
}
class RegularOrder extends Order {
    RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    @Override
    double calculateBill() {
        // No discount
        return baseAmount + deliveryCharge;
    }
}
class PremiumOrder extends Order {
    PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }
    @Override
    double calculateBill() {
        // 20% discount on base amount
        double discountedAmount = baseAmount - (baseAmount * 0.20);
        return discountedAmount + deliveryCharge;
    }
}
public class FoodDelivery {
    public static void main(String[] args) {
        // Polymorphism ||  parent reference
        Order o1 = new RegularOrder(201, 500.0);
        Order o2 = new PremiumOrder(202, 800.0);

        System.out.println("Regular Order");
        o1.display();

        System.out.println("\n Premium Order (20% Discount)");
        o2.display();
    }
}
