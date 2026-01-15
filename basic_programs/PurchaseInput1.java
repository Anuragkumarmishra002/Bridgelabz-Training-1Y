import java.util.Scanner;
public class PurchaseInput1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print(" unit price = " );
double unitPrice = sc.nextDouble();
int quantity = sc.nextInt();
double total = unitPrice*quantity;
System.out.println("The total purchase price is INR "+total+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
}
}
