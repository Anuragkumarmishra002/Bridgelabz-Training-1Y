
import java.util.Scanner;
class DivisionCheck{
public static void main(String[] args ) {
Scanner input = new Scanner(System.in);
int num = input.nextInt();
if( num % 5 == 0 ) {
System.out.print("The number " + num + " is  divisble by 5   ");
}
else { 
System.out.print("Not divisible by 5 ");
}
}
}