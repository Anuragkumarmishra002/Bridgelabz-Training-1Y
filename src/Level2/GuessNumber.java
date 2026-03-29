package Level2;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
// Taking input
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100, attempts = 0;

        System.out.println("Think of a number between 1 and 100 ");
// Logic for Guess
        while (low <= high) {
            int guess = (low + high) / 2;
            attempts++;

            System.out.println("Attempt " + attempts + " My guess is " + guess);
            System.out.println("Enter | (HIGH || LOW || CORRECT ) | According to guess ");
            String feedback = sc.next().toUpperCase();

            if (feedback.equals("CORRECT")) {
                System.out.println("Guessed in " +attempts+" attempts ");
                break;
            } else if (feedback.equals("HIGH")) {
                high = guess - 1;
            } else if (feedback.equals("LOW")) {
                low = guess + 1;
            }
        }
    }
}