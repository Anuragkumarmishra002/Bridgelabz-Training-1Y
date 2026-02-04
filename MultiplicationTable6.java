import java.util.Scanner;

public class MultiplicationTable6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number ");
        int number = input.nextInt();

        // Array to store results (for 6 to 9)
        int[] result = new int[4];

        // Calculate and display table
        for (int i = 6; i <= 9; i++) {
            result[i - 6] = number * i;
            System.out.println(number + " *" + i + " =" + result[i - 6]);
        }

        input.close();
    }
}
