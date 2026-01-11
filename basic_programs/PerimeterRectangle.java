import java.util.Scanner ;
public class PerimeterRectangle{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Calucte The Perimeter Of Rectangle " ) ;
System.out.println("Enter the lenght " ) ;
double lenght =  sc.nextDouble();
System.out.println("Enter the width " ) ;
double width =  sc.nextDouble();
double perimeter =  2 * ( lenght * width ) ;
System.out.printf("The Perimeter Of Rectangle Is %.2f%n", perimeter);
}
}