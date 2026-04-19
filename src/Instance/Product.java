package Instance;

class Product {
     private String productName;
      private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name = " + productName);
        System.out.println("Price = Rs " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created  " + totalProducts);
    }
}

 class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("Pen", 10.00);
        Product p2 = new Product("Notebook", 60.00);
        Product p3 = new Product("Eraser", 5.00);

        System.out.println("Product 1 ");
        p1.displayProductDetails();

        System.out.println("\nProduct 2 ");
        p2.displayProductDetails();

        System.out.println("\nProduct 3 ");
        p3.displayProductDetails();

        System.out.println("\nTotal Products ");
        Product.displayTotalProducts();
    }
}