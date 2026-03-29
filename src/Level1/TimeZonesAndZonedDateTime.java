package Level1;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import  java.util.Scanner ;
public class TimeZonesAndZonedDateTime {
    public static  void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        // Controls The Format Of How The Time Is Displayed
        DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss  ");
        // GMT =  Greenwhich Mean Time
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("GMT time is " + gmt.format(fmt));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        // IST  = India Standard Time
        System.out.println("IST time  is " + ist.format(fmt));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        // PST = Pacific Standard Time
        System.out.println("PST time  is " + pst.format(fmt));


    }
}
