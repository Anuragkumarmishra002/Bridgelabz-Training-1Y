package Level1;
import java.time.LocalDate ;
import java.util.Scanner ;
public class DateComparison {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date 1 (yyyy-MM-dd) ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());
        System.out.println ("Enter Date 2 (yyyy-MM-dd) : ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());
        if (date1.isBefore(date2)) {
            System.out.println("Date 1 is before date 2");

        } else if (date1.isAfter(date2)) {
            System.out.println("Date 1 is after date 2");

        } else {
            System.out.println("Both dates are equal ");
        }
    }
}
