package LibraryManagement;


 class EBook extends Book {
    private double fileSize;

    public EBook(int id, String title, double fileSize) {
        super(id, title);
        this.fileSize = fileSize;
    }

    @Override
    public void display() {
        System.out.println("EBook [ID=" + id +
                ", Title=" + title +
                ", FileSize=" + fileSize + "MB" +
                ", Issued=" + isIssued + "]");
    }
}