package ScenerioBased;
import java.util.ArrayList;
public class ProductRating {
    public static void main(String[] args) {
        // Ratings from old system primitive array
        int[] primitiveRatings = {4, 5, 3, 4};
        // Ratings from new system (ArrayList with Integer objects)
        ArrayList<Integer> objectRatings = new ArrayList<>();
        objectRatings.add(5);
        objectRatings.add(null);  // null rating
        objectRatings.add(4);
        ArrayList<Integer> combinedRatings = new ArrayList<>();
        for (int rating : primitiveRatings) {
            combinedRatings.add(rating);
        }
        for (Integer rating : objectRatings) {
            if (rating != null) {
                combinedRatings.add(rating);
            }
        }
        int totalSum = 0;
        int totalCount = 0;
        for (Integer rating : combinedRatings) {
            totalSum += rating;
            totalCount++;
        }
        double averageRating = (totalCount > 0) ? (double) totalSum / totalCount : 0;
        System.out.println("Combined Ratings " + combinedRatings);
        System.out.println("Average Rating " + averageRating);
    }
}