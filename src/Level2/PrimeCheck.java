package Level2;
import java.util.Scanner;

public class PrimeCheck {

    // if n less than or equal to  1 not a prime number
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        // Function for prime number
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}