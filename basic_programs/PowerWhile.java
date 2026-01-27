import java.util.Scanner;
class PowerWhile{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter a number ");
int num=input.nextInt();
System.out.print("Enter the power ");
int pow=input.nextInt();
if(num<=0 || pow<0){
System.out.println("Please enter positive number");
return;
}
int result=1;
int counter=0;
while(counter<pow){
result=result*num;
counter++;
}
System.out.print(num+" to the power of "+pow+" is "+result);
}
}
