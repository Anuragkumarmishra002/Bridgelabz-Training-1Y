import java.util.Scanner ;
class SumOfDigits {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number " )
int originalNum = input.nextInt();
int num = originalNum ;
int sum = 0 ;
while(num != 0){
int digit  = num % 10 ; 
sum += digit ;
num =  num / 10 ;
}
System.out.println("The Sum Of The Given Digit is " + sum );
input.close();
}
}