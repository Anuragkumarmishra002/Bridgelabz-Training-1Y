package Level1;
import java.time.LocalDate;
import java.util.Scanner ;
public class DateArithmetic {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date in this format (yyyy-MM-DD) ");
        String input = sc.nextLine();
        // converting to object
        LocalDate date = LocalDate.parse(input);
        System.out.println("Your date is " +date);
        // Adding 7 days
        date = date.plusDays(7);
        System.out.println("Your date after adding 7 days is "+ date);
        // Adding a month
        date = date.plusMonths(1);
        System.out.println("Your date after adding 1 month "+ date);
        // Adding 2 years
        date = date.plusYears(2);
        System.out.println("Your date after adding 2 years is " +date);
        // final date
        System.out.println("Final date is "+date);
    }
}
