
import java.util.Scanner ;
class SalaryBonous {
public static void main(String[] args ) {
Scanner input = new Scanner(System.in);
System.out.print("Enter Salary " ) ;
double salary = input.nextDouble();
System.out.print("Enter Years Of Service " );
double yearService = input.nextDouble();
 double bonousAmount = 0;
if(yearService > 5 ) {
 bonousAmount =  salary * (5.0/100) ; 
 System.out.print("The bonous amount after bonous is " + bonousAmount);}
 else {
 System.out.print("No bonous and the salary is " + salary);}
 }
 }