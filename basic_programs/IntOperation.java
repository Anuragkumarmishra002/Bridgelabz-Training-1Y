import java.util.Scanner;
public class IntOperation{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a , b, c: ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int r1=a+b*c;
int r2=a*b+c;
int r3=c+a/b;
int r4=a%b+c;
System.out.println("Results are: "+r1+", "+r2+", "+r3+", "+r4);
}
}
