import java.util.*;
public class FinallyInteger {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two integers");
            int a = sc.nextInt() ;
            int b = sc.nextInt() ;
            int result = a / b ;
            // b = 0 en exception will occur
            System.out.println("The result after division is " + result );
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide enter any number other than 0 ");
        }
        finally {
            System.out.println("The operation was completed ");
        }
    }
}
