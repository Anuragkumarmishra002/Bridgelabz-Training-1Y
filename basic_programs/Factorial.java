
import java.util.Scanner ;
class Factorial {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number  " ) ;
int n = input.nextInt();
if(n<0) {
	System.out.println("Invalid Number Enter A Positive Number" ) ;
return ; }
int fact = 1 ;
 while( n!=0 )  {
  fact = fact * n ;
  n-- ;
  }
  System.out.print("The factorial of the number is " +fact);
  }
  }
  