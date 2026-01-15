
import java.util.Scanner ;
public  class UniversityFeesInput{
public static void main(String[] args) {
Scanner input =  new Scanner(System.in) ;
System.out.print("Enter the fees " ) ;
double fees = input.nextDouble();
System.out.print("Enter the discount "  ) ;
double discountPercentage  = input.nextDouble();
double discount = fees * ( discountPercentage / 100 ) ;
double amount =  fees - discount ;

System.out.print("Thh Fees After Discount is " + amount ) ;
}
}
