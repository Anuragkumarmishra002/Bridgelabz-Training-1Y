
import java.util.Scanner ;
class NaturalMaxCompare {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double n = input.nextInt();
double sumFormulae = n *(n+1)/2 ;
double total = 0 ;
while(n!=0){
 total += n ;
 n-- ;
 }
 System.out.println("The sum via loop is " +total);
 System.out.println("The sum via formula is " +sumFormulae);
 if( total == sumFormulae ){
 System.out.print("Yes they are equal and verified " ) ; }
 else {
 System.out.print("Not Equal " ) ; }
 }
 }