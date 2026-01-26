


import java.util.Scanner;
class RocketCountdown{
public static void main(String[] args ){
Scanner input =  new Scanner(System.in);
System.out.print("Enter Number  " ) ;
int counter = input.nextInt();
 while ( counter >= 1 ) {
 System.out.println( counter ) ;
 counter -- ;
 }
System.out.print("The Rocket Takes Off " ) ;
}
}