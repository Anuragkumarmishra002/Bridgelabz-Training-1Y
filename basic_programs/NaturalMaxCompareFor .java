
import java.util.Scanner ;
class NaturalMaxCompareFor {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number  " ) ;
int n = input.nextInt();
if(n<0) {
	System.out.println("Invalid Number Enter A Positive Number" ) ;
return ; }
int sumFormulae = n *(n+1)/2 ;
int total = 0 ;
for( int i = n ; i >= 0 ; i--){
 total += i ;
 }
 System.out.println("The sum via loop is " +total);
 System.out.println("The sum via formula is " +sumFormulae);
 if( total == sumFormulae ){
 System.out.print("Yes they are equal , hence verified " ) ; }
 else {
 System.out.print("Not Equal " ) ; }
 }
 }