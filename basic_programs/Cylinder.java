import java.util.Scanner ;
public class Cylinder{
	public static void main(String[] args )  {
		Scanner sc =  new Scanner(System.in)  ;
		System.out.println("Enter The Radius ");
		 double radius = sc.nextDouble();
		 System.out.println("Enter The Height");
		 double height = sc.nextDouble();
		 double area   =  3.14 * (radius * radius) * height;
		 System.out.printf("The volume of cylinder is %.2f%n " , area);
	}
}