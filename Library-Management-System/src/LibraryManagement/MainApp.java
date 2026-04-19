package LibraryManagement;


import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n LIBRARY MENU ");
            System.out.println("1. Add TextBook");
            System.out.println("2. Add EBook");
            System.out.println("3. View Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title1 = sc.nextLine();
                    System.out.print("Enter Pages: ");
                    int pages = sc.nextInt();

                    lib.addBook(new TextBook(id1, title1, pages));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title2 = sc.nextLine();
                    System.out.print("Enter File Size: ");
                    double size = sc.nextDouble();

                    lib.addBook(new EBook(id2, title2, size));
                    break;

                case 3:
                    lib.showBooks();
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String uname = sc.nextLine();
                    System.out.print("Enter Days: ");
                    int days = sc.nextInt();

                    lib.issueBook(bid, uname, days);
                    break;

                case 5:
                    System.out.print("Enter Book ID: ");
                    int rid = sc.nextInt();

                    lib.returnBook(rid);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice ");
            }
        }
    }
}