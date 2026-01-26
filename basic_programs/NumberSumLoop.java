import java.util.Scanner;
class NumbersSumLoop {
public  static void main(String[] args ) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number and 0 to stop " ) ;
double num ;
 num = input.nextDouble();
double total = 0  ;
while(num !=0){
total += num ;
System.out.print("Enter the number and 0 to stop ");
num = input.nextDouble();
 }
 System.out.print("The sum is " +total );
 }
 }
 