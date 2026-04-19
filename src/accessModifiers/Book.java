package accessModifiers;

class Book {
    public String isbn;
    protected String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
        System.out.println("Author updated to  " + this.author);
    }
    public void displayDetails() {
        System.out.println("ISBN = " + isbn);
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
    }
}

class EBook extends Book {
    private String format;

    public EBook(String isbn, String title, String author, String format) {
        super(isbn, title, author);
        this.format = format;
    }

    public void displayDetails() {
        System.out.println("ISBN = " + isbn);
        System.out.println("Title = " + title);
        System.out.println("Author = " + getAuthor());
        System.out.println("Format = " + format);
    }
}

class BookMain {
    public static void main(String[] args) {
        Book b = new Book("978-0-06-112008-4", "The Friend", "Anshu");

        System.out.println("\n Book Details");
        b.displayDetails();

        System.out.println("\n Updating Author");
        b.setAuthor("H. Lee");

        System.out.println("\n Updated Book Details");
        b.displayDetails();

        System.out.println("\n EBook Details");
        EBook eb = new EBook("978-3-16-148410-0", "Brick ", "Shivam", "PDF");
        eb.displayDetails();
    }
}