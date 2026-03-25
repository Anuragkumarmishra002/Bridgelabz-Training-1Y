import java.util.*;
public class UncheckedException {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the numerator ");
            int a = sc.nextInt();
            System.out.print("Enter the  denominator: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result is  " + result);
        } catch (ArithmeticException  e) {
            System.out.println("Cannot be  divide by zero ");
        } catch (InputMismatchException  e) {
            System.out.println("Please enter numbers only ");
        }
    }
}
