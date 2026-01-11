import java.util.Scanner ;
public class PowerCal{
public static void main(String[] args ){
Scanner sc =  new Scanner(System.in);
System.out.println("Power Calculation " ) ;
System.out.println("Enter Base ") ;
double base =  sc.nextDouble();
System.out.println(" Enter Exponent ") ;
double exponent = sc.nextDouble();
double result = Math.pow(base,exponent);
System.out.printf("The Result Of Operation Is %.2f%n" ,result ) ;
}
}