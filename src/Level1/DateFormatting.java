package Level1;
import java.time.LocalDate ;
import java.time.format.DateTimeFormatter ;
import java.util.Scanner ;
public class DateFormatting {
    public static void main(String [] args ){
        // Taking Today Date Automatically
        LocalDate today = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Formatted date of today in format 1  "+today.format(format1));
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(" Formatted date of today in format 2 " +today.format(format2));
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Formatted date of today in format 3 "+today.format(format1));
    }

}
