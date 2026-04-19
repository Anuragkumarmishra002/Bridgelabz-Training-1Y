package Level1;
class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = 0;
        this.price = 0.0;
        this.isBooked = false;
    }

    public void bookTicket(int seatNumber, double price) {
        if (isBooked) {
            System.out.println("Seat " + seatNumber + " is already booked ");
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully for \"" + movieName + "\"");
        }
    }

    public void displayTicketDetails() {
        if (!isBooked) {
            System.out.println("No ticket has been booked yet");
            return;
        }
        System.out.println("Movie Name  : " + movieName);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Price       : Rs." + price);
        System.out.println("Status      : Confirmed");
    }
}

class Movie {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Pushpa 2");
        MovieTicket ticket2 = new MovieTicket("Animal");

        System.out.println(" Booking Ticket 1 ");
        ticket1.bookTicket(14, 299.00);
        ticket1.displayTicketDetails();

        System.out.println("\n Booking Ticket 2 ");
        ticket2.bookTicket(7, 199.00);
        ticket2.displayTicketDetails();

        System.out.println("\n Trying to Double Book Ticket 1 ");
        ticket1.bookTicket(14, 299.00);
    }
}