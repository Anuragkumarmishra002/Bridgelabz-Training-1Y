

class Book {
    int bookId;
    String title;
    double price;
    static String libraryName = "City Central Library" ;
    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
    double calculateFine(int daysLate) {
        return 0; // Base: no fine defined here
    }
    void display() {
        System.out.println("Library = " + libraryName);
        System.out.println("Book ID = " + bookId);
        System.out.println("Title   = " + title);
        System.out.println("Price   = ₹" + price);
    }
}

class TextBook extends Book {
    TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }
    @Override
    double calculateFine(int daysLate) {
        return daysLate * 2; // ₹2 per day
    }
}
class Magazine extends Book {
    Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }
    @Override
    double calculateFine(int daysLate) {
        return daysLate * 5; // ₹5 per day
    }
}
public class SmartLibrary {
    public static void main(String[] args) {
        // Polymorphism: parent reference holding child objects
        Book b1 = new TextBook(101, "Java Programming", 350.0);
        Book b2 = new Magazine(102, "Science for engineers", 80.0);

        System.out.println(" TextBook ");
        b1.display();
        System.out.println("Fine for 5 days late = ₹" + b1.calculateFine(5));

        System.out.println("\nMagazine ");
        b2.display();
        System.out.println("Fine for 3 days late = ₹" + b2.calculateFine(3));
    }
}
