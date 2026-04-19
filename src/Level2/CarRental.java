package Level2;
class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double RATE_PER_DAY = 1500.00;
    public CarRental() {
        this.customerName = "Guest";
        this.carModel = "Maruti Swift";
        this.rentalDays = 1;
    }
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    public void calculateTotalCost() {
        double totalCost = RATE_PER_DAY * rentalDays;
        System.out.println("Total Cost = Rs " + totalCost);
    }
    public void displayRentalDetails() {
        System.out.println("Customer = " + customerName);
        System.out.println("Car Model = " + carModel);
        System.out.println("Rental Days = " + rentalDays);
        calculateTotalCost();
    }
}
 class CarRentalMain {
    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Amit ", "Honda City", 5);
        CarRental r3 = new CarRental("Anshu ", "Toyota Innova", 7);

        System.out.println("\nDefault Rental ");
        r1.displayRentalDetails();

        System.out.println("\n Rental 1 ");
        r2.displayRentalDetails();

        System.out.println("\n Rental 2 ");
        r3.displayRentalDetails();
    }
}