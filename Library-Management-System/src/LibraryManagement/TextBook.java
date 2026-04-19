package LibraryManagement;


public class TextBook extends Book {
    private int pages;

    public TextBook(int id, String title, int pages) {
        super(id, title);
        this.pages = pages;
    }

    @Override
    public void display() {
        System.out.println("TextBook [ID=" + id +
                ", Title=" + title +
                ", Pages=" + pages +
                ", Issued=" + isIssued + "]");
    }
}