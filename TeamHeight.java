import java.util.Scanner;
public class TeamHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Creating a double array of size 11
        double[] height = new double[11];
        double sum = 0;
        // Getting  input from the user
        System.out.println("Enter the heights of 11 football players ");
        for (int i = 0; i < height.length; i++) {
            height[i] = input.nextDouble();
            sum += height[i];
        }
        // Calculating  mean
        double mean = sum / height.length;
        // And mean height is 
        System.out.printf("Mean height of the football team %.2f  ",  mean);
        input.close();
    }
}
