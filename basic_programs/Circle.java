import java.util.Scanner ;
public class Circle{
	public static void main(String[] args )  {
		Scanner sc =  new Scanner(System.in)  ;
		System.out.println("Enter The Radius ");
		 float radius = sc.nextFloat();
		 double area   =  3.14 * radius * radius ;
		 System.out.println("The area of circle is " +area);
	}
}