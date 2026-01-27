import java.util.Scanner;
public class FactorFind{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a positive integer number ");
int num = input.nextInt();
if(num<=0)
System.out.println("Error Enter a number greater than 0.");
else{
System.out.println("Factors of "+num+" are:");
for(int i=1;i<=num;i++)
if(num%i==0)
System.out.println(i);
}
input.close();
}
}
