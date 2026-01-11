import java.util.Scanner;
public class Miles {
public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
System.out.println("Convert Kilometers to Miles");
System.out.println("Enter The Kilometers In Order To Convert It Into Miles");
double kilometers =  sc.nextDouble();
double miles =  kilometers * 0.621371 ;
System.out.printf("Result In Miles Is %.2f " ,miles );
}
}