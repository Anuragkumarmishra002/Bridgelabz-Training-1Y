import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number ");
        long num = input.nextLong();

        long store = num;
        int count = 0;
        long t = store;
        while (t > 0) {
            count++;
            t = t / 10;
        }

        int[] digits = new int[count];
        int index = 0;

        while (store > 0) {
            digits[index] = (int)(store % 10);
            index++;
            store = store / 10;
        }
        int[] freq = new int[10];

        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }
        System.out.println("\nFrequency of digits in " + num + );
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times ");
            }
        }
        input.close();
    }
}
