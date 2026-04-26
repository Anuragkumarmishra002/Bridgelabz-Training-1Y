package library.Book;

 class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void addBook() {
        System.out.println("Book Added: " + title);
    }
}