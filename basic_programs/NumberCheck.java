

import java.util.Scanner;
class NumberCheck {
public static void main(String[] args ){
Scanner input =  new Scanner(System.in);
System.out.print("Enter Number  " ) ;
int num = input.nextInt();

if ( num > 0  ) {
System.out.printf("Number Is Positve " ); }
else if ( num < 0 ) {
System.out.printf("Number Is Negative " ); }
else if ( num == 0 ) {
System.out.printf("Number Is Zero " ); }


}
}