package LibraryManagement;


public abstract class Book {
    protected int id;
    protected String title;
    protected boolean isIssued;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }

    public int getId() {
        return id;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        isIssued = true ;
    }

    public void returnBook() {
        isIssued = false;
    }

    public abstract void display();
}