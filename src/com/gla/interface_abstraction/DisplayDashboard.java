package com.gla.interface_abstraction;
public class DisplayDashboard {
    interface VehicleDashboard {
        void displaySpeed();

        default void displayBattery() {
            System.out.println("Battery feature not available");
        }
    }
    static class PetrolCar implements VehicleDashboard {
        private int speed;

        PetrolCar(int speed) {
            this.speed = speed;
        }

        @Override
        public void displaySpeed() {
            System.out.println("Speed " + speed + " km/h");
        }
    }
    static class ElectricCar implements VehicleDashboard {
        private int speed;
        private int battery;
        ElectricCar(int speed, int battery) {
            this.speed = speed;
            this.battery = battery;
        }
        @Override
        public void displaySpeed() {
            System.out.println("Speed " + speed + " km/h");
        }
        @Override
        public void displayBattery() {
            System.out.println("Battery " + battery + "%");
        }
    }
    public static void main(String[] args) {
        VehicleDashboard petrol = new PetrolCar(50);
        VehicleDashboard electric = new ElectricCar(40, 50);
        System.out.println("Petrol Car ");
        petrol.displaySpeed();
        petrol.displayBattery();    // Uses default
        System.out.println("\n Electric Car ");
        electric.displaySpeed();
        electric.displayBattery();  // Uses overridden
    }
}