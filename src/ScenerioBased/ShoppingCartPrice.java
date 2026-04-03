package ScenerioBased;
public class ShoppingCartPrice {
    public static void main(String[] args) {
        // Prices stored as strings
        String[] prices = {"250", "499", "99", "abc", "150"};

        int total = 0;
        for (String price : prices) {
            try {
                int value = Integer.parseInt(price);
                total += value;

            } catch (NumberFormatException e) {
                System.out.println("Invalid price: " + price + " (skipped)");
            }
        }
        System.out.println("Total Price " + total);
    }
}