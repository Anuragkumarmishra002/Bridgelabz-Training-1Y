import java.util.Scanner;
class NaturalSum {
public static void main(String[] args ){
Scanner input =  new Scanner(System.in);
System.out.print("number = " ) ;
int num = input.nextInt();

 int sum = 0 ;
if(num > 0  ) {
 sum  = num*(num+1)/2 ;
System.out.print("The Number Is Positive And The Sum Is " +sum );  }
	else {
	System.out.print(" The Number Is Not Positive " ); }

}
}