
import java.util.Scanner;
class LargestNum {
public static void main(String[] args ){
Scanner input =  new Scanner(System.in);
System.out.print("number1 " ) ;
int num1 = input.nextInt();
System.out.print("number2 " ) ;
int num2 = input.nextInt();
System.out.print("number3 " ) ;
int num3 = input.nextInt();
 int largest = 0 ;
if(num1 > num2 && num1 > num3  ) {
largest = num1 ; }
	else if ( num2 > num1 && num2 > num3 ) {
	largest = num2 ; }
		else if  ( num3 > num1 && num3 > num2 ) {
		largest = num3 ; }
System.out.print("The Largest Number Is " +largest ); 
}
}