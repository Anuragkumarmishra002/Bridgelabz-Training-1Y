import java.util.Scanner;
public class CalculatorFloat{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double number1=sc.nextDouble();
double number2=sc.nextDouble();
double add=number1+number2;
double sub=number1-number2;
double mul=number1*number2;
double div=number1/number2;
System.out.println("Addition: "+add+", Subtraction: "+sub+", Multiplication: "+mul+", Division: "+div);
}
}
