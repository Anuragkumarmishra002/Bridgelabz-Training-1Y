import java.util.Scanner;

public class StoreAndSumArray {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        //  Declare array as well as  total and index
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        //  Infinite while loop
        while (true) {
            System.out.print("Enter a number: ");
            double value = input.nextDouble();

            //  Break if number is 0 or negative
            if (value <= 0) {
                break;
            }

            //  Break if array size reaches 10
            if (index == 10) {
                break;
            }

            //  Store value and increment index
            numbers[index] = value;
            index++;
        }

        //  For loop to calculate total
        for (int i = 0; i < index; i++) {
            System.out.println("Value at index " + i + ": " + numbers[i]);
            total += numbers[i];
        }
  //  Display total
      
        System.out.println("Total of all numbers: " + total);

        input.close();
    }
}
