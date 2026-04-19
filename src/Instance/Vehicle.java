package Instance;
class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 2500.00;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name  = " + ownerName);
        System.out.println("Vehicle Type = " + vehicleType);
        System.out.println("Registration Fee  = Rs " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to = Rs " + registrationFee);
    }
}

 class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Anshu", "Bike");
        Vehicle v2 = new Vehicle("Shivam", "Car");

        System.out.println(" Vehicle 1 Details ");
        v1.displayVehicleDetails();

        System.out.println("\n Vehicle 2 Details ");
        v2.displayVehicleDetails();

        System.out.println("\n Updating Registration Fee ");
        Vehicle.updateRegistrationFee(3000.00);

        System.out.println("\n Vehicle 1 After Update ");
        v1.displayVehicleDetails();

        System.out.println("\n Vehicle 2 After Update ");
        v2.displayVehicleDetails();
    }
}