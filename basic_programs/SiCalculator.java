import java.util.Scanner ;
public class SiCalculator{
public static void main(String[] args){
Scanner sc =  new Scanner(System.in);
System.out.println("Enter The Principal" ) ;
double principal = sc.nextDouble();
System.out.println("Enter The Rate");
double rate =  sc.nextDouble();
System.out.println("Enter The Time");
double time = sc.nextDouble ();
double si = (principal * rate * time ) / 100 ;
System.out.printf("The Simple Intrest Is %.2f%n ", si );
}
}
