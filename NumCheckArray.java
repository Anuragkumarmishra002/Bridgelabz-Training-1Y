import java.util.Scanner;

public class NumCheckArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] num = new int[5];

        // a. Take user input
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = input.nextInt();
        }

        // b & c. Check each number
        for (int i = 0; i < num.length; i++) {

            if (num[i] > 0) {
                System.out.println("The number is positive: " + num[i]);

                if (num[i] % 2 == 0) {
                    System.out.println("The number is even: " + num[i]);
                } else {
                    System.out.println("The number is odd: " + num[i]);
                }

            } else if (num[i] < 0) {
                System.out.println("The number is negative: " + num[i]);

            } else {
                System.out.println("The number is zero: " + num[i]);
            }

            System.out.println();
        }

        // d. Compare first and last element
        if (num[0] == num[num.length - 1]) {
            System.out.println("The first and last elements are equal");
        } 
        else if (num[0] > num[num.length - 1]) {
            System.out.println("The first element is greater than the last element");
        } 
        else {
            System.out.println("The last element is greater than the first element");
        }

        input.close();
    }
}
