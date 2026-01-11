import java.util.Scanner ;
public class Average{
public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
System.out.println("Calculate Average of Three Numbers");
System.out.println("Enter The First Number");
double num1 = sc.nextDouble();
System.out.println("Enter The Second Number");
double num2 =  sc.nextDouble();
System.out.println("Enter The Third Number");
double num3 =  sc.nextDouble();
double average =  (num1 + num2 + num3 ) / 3 ;
System.out.printf("The Average Of 3 Numbers Is %.2f%n",average);
}
} 