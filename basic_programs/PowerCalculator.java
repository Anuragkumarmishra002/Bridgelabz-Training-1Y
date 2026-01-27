import java.util.Scanner;
class PowerCalculator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a positive number ");
int num=sc.nextInt();
System.out.print("Enter the power positive integer ");
int pow=sc.nextInt();
if(num<=0 || pow<0){
System.out.println("Invalid input");
return;
}
int result=1;
for(int i=1;i<=pow;i++){
result*=num;
}
System.out.println(num+" raised to the power "+pow+ " is "+result);
}
}
