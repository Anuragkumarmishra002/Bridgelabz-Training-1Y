import java.util.Scanner;
public class Division{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print(" Number 1 " );
int number1 = sc.nextInt();
System.out.print(" Number 2 ");
int number2 = sc.nextInt();
System.out.println("The Quotient is "+(number1/number2)+" and Reminder is "+(number1%number2)+" of two number "+number1+" and "+number2);
}
}
