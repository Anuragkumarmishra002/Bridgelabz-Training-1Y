
import java.util.Scanner;
class NumbersSumLoopBreak {
public  static void main(String[] args ) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number and 0 to stop " ) ;
 double  num ;
num = input.nextDouble();
double total = 0  ;
while( true){
total += num ;
System.out.print("Enter the number and 0 to stop ");
num = input.nextDouble();
if( num == 0 ) 
break ;
 }
 System.out.print("The sum is " +total );
 }
 }
 