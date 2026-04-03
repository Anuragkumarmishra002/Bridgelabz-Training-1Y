package ScenerioBased;
public class ShoppingCart {
    public static void main(String[] args) {
        String[] priceList = {"250", "499", "99", "abc", "150"};
        int total = 0;
        for (String price : priceList) {
            try {
                // Convert string to integer using wrapper class
                int value = Integer.parseInt(price);
                total = total+ value;
            }
            catch (NumberFormatException e) {
                // Handle invalid price
                System.out.println("Invalid price found " + price + " skipped");
            }
        }
        // Final total
        System.out.println("Total Price " + total);
    }
}