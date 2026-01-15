import java.util.Scanner;
class TriangleArea{
public static void main(String[] args){
Scanner input =new Scanner(System.in);
System.out.println(" base "  ) ;
double base= input.nextDouble();
System.out.println(" height " );
double height= input.nextDouble();
double areaInInches=0.5*base*height;
double areaInCm=areaInInches*6.4516;
System.out.println("Area in square inches is "+areaInInches+" and in square centimeters is "+areaInCm);
}
}
