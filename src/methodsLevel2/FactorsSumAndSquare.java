
package methodsLevel2;
import java.util.Scanner ;
public class FactorsSumAndSquare {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int  findSum(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum = sum + factors[i];
        }
        return sum;
    }

    public static int findProducts(int[] factors) {
        int product = 1;
        for (int i = 1; i < factors.length; i++) {
            product =product + (product * factors[i]);
        }
        return product;
    }

    public static int sumSquareFactors(int[] factors) {
        int sumSquare = 0;
        for (int i = 0; i < factors.length; i++) {
            sumSquare = sumSquare + (int) Math.pow(factors[i], 2);
        }


        return sumSquare;

    }
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        System.out.println("Factors are");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        int sum = findSum(factors);
        int product = findProducts(factors);
        double sumOfSquares = sumSquareFactors(factors);

        System.out.println("\nSum of factors " + sum);
        System.out.println("Product of factors " + product);
        System.out.println("Sum of squares of factors " + sumOfSquares);
    }
}

