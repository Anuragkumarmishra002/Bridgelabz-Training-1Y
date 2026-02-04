import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int[] multi = new int[10];

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            multi[i - 1] = number * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multi[i - 1]);
        }

        input.close();
    }
}
