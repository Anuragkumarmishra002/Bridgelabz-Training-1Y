package Level2;
class Book {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("\"" + title + "\" has been borrowed successfully ");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available ");
        }
    }

    public void returnBook() {
        if (!availability) {
            availability = true;
            System.out.println("\"" + title + "\" has been returned successfully.");
        } else {
            System.out.println("\"" + title + "\" was not borrowed.");
        }
    }

    public void displayDetails() {
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Price  = Rs." + price);
        System.out.println("Available   =  " + (availability ? "Yes" : "No"));
    }
}

 class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 199.00);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 299.00);

        System.out.println(" Book Details ");
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();

        System.out.println(" Borrow Operations");
        book1.borrowBook();
        book1.borrowBook();

        System.out.println(" Return Operations");
        book1.returnBook();
        book1.returnBook();

        System.out.println("Updated Book Details ");
        book1.displayDetails();
    }
}