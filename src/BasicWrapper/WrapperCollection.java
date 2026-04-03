package BasicWrapper;
import java.util.ArrayList;

public class WrapperCollection {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};

        // Convert primitive array to ArrayList<Double>
        ArrayList<Double> priceList = new ArrayList<>();
        for (double price : prices) {
            priceList.add(price);  // Auto-boxing
        }

        // Calculate highest price
        double highest = priceList.get(0);
        for (Double price : priceList) {
            if (price > highest) {
                highest = price;
            }
        }
        // Calculate average price
        double sum = 0;
        for (Double price : priceList) {
            sum += price;
        }
        double average = sum / priceList.size();
        // Print results
        System.out.println("Price List " + priceList);
        System.out.println("Highest price " + highest);
        System.out.println("Average price " + average);
    }
}