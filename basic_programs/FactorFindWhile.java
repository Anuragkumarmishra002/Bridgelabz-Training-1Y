import java.util.Scanner;
public class FactorFindWhile{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a positive integer: ");
int num=input.nextInt();
if(num<=0)
System.out.println(" Enter a number greater than 0.");
else{
System.out.println("Factors of "+num+" are:");
int i=1;
while(i<=num){
if(num%i==0)
System.out.println(i);
i++;
}
}
input.close();
}
}
