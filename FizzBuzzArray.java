import java.util.Scanner;
 class FizzBuzzArray {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }
        String[] result = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = Integer.toString(i);
            }
        }
        for (int i = 0; i <= n; i++) {
            System.out.println("Position "+ i +" = " +result[i]);
        }
    }
}
