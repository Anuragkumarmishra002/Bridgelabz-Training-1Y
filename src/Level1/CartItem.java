package Level1;
class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }
    public void addItem(int quantity) {
        this.quantity += quantity;
        System.out.println(quantity + " x " + itemName + " added to cart ");
    }
    public void removeItem(int quantity) {
        if (quantity > this.quantity) {
            System.out.println("Cannot remove, Only " + this.quantity + " x " + itemName + " in cart");
        } else {
            this.quantity -= quantity;
            System.out.println(quantity + " x " + itemName + " removed from cart");
        }
    }

    public void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item     : " + itemName);
        System.out.println("Price    : Rs " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : Rs " + total);
    }
}

class Cart {
    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 55000.00);
        CartItem item2 = new CartItem("Mouse", 799.00);

        System.out.println(" Cart Operations ");
        item1.addItem(2);
        item2.addItem(3);

        System.out.println("\n Remove Items ");
        item2.removeItem(1);
        item2.removeItem(5);

        System.out.println("\n Cart Summary ");
        item1.displayTotalCost();
        System.out.println();
        item2.displayTotalCost();
    }
}