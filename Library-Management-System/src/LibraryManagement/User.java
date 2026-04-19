package LibraryManagement;


public class User {
    private String name;
    private int bookId;
    private int days;

    public User(String name, int bookId, int days) {
        this.name = name;
        this.bookId = bookId;
        this.days = days;
    }

    public int getBookId() {
        return bookId;
    }

    public void display() {
        System.out.println("User: " + name +
                " | Book ID: " + bookId +
                " | Days: " + days);
    }
}