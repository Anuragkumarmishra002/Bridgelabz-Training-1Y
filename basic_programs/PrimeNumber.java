import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int number = input.nextInt();

        boolean Prime = true;

     
        if (number <= 1) {
            Prime = false;
        } else {
            
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    Prime = false;
                    break;
                }
            }
        }

        if (Prime) {
            System.out.println("Number is a Prime Number");
        } else {
            System.out.println("Number is not a Prime Number");
        }
    }
}