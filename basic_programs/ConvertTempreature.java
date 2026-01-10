import java.util.Scanner ;
public class ConvertTempreature{
	public static void main(String[] args )  {
		Scanner sc =  new Scanner(System.in)  ;
		System.out.println("Enter The Tempreature ");
		 float celsius = sc.nextFloat();
		 float fahrenheit = (celsius * 9/5) + 32;
		 System.out.println(fahrenheit);
	}
}