
import java.util.Scanner ;
class FactorialFor {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number  " ) ;
int n = input.nextInt();
if(n<0) {
	System.out.println("Invalid Number Enter A Positive Number" ) ;
return ; }
int fact  = 1;
for( int i = n ; i > 0 ; i-- ){
fact = fact * i ; }
  System.out.print("The factorial of the number is = "+fact);
  }
  }
  