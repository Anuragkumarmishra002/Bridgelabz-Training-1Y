import java.util.Scanner;
class MultiplesWhile{
public static void main(String[] args){
Scanner input =new Scanner(System.in);
System.out.print("Enter a positive number less than 100 ");
int number= input.nextInt();
if(number<=0 || number>=100){
System.out.println("Invalid Number  ");
return;
}
int counter=1;
System.out.println("Multiples of "+number+" below 100");
while(counter<100){
if(counter%number==0){
System.out.print(counter+" ");
}
counter++;
}
}
}
