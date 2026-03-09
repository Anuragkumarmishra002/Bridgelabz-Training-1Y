/*. Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do
the following. Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertKmToMiles(double km) =>
a. Method To convert kilometers to miles and return the value. Use the following code
double km2miles = 0.621371;
b. Method to convert miles to kilometers and return the value. Use the following code
double miles2km = 1.60934;
c. Method to convert meters to feet and return the value. Use the following code to convert
double meters2feet = 3.28084;
d. Method to convert feet to meters and return the value. Use the following code to convert
double feet2meters = 0.3048; */

package methodsLevel2;
import java.util.Scanner ;
public class UnitConverterOne {
   public static double convertKm2miles( double km) {
       double km2miles = 0.621372 ;
    double miles = km * km2miles ;
    return miles ;
   }
public static  double convertMiles2km( double miles) {
       double miles2km = 1.60934;
       double km = miles * miles2km ;
       return km ;
}
public static double convertMeters2feet(double meters ){
       double meters2feet = 3.28084 ;
       double feet = meters * meters2feet ;
       return feet ;
}
public static double convertFeet2meters( double feet){
       double feet2meters = 0.3048 ;
       double meters =  feet * feet2meters ;
       return meters ;
}
public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the km");
       int km = sc.nextInt();
       System.out.println("Enter the miles");
       int miles = sc.nextInt();
       System.out.println("Enter the meters ") ;
       int meters = sc.nextInt();
       System.out.println("Enter the feet");
       int feet = sc.nextInt();
       double convertedKmToMiles = convertKm2miles(km);
    double convertedMilesToKm = convertMiles2km(miles);
    double convertedMetersToFeet = convertMeters2feet(meters);
    double convertedFeetToMeters = convertFeet2meters(feet);
    System.out.println("Kilometers to Miles " + convertedKmToMiles);
    System.out.println("Miles to Kilometers " + convertedMilesToKm);
    System.out.println("Meters to Feet " + convertedMetersToFeet);
    System.out.println("Feet to Meters " + convertedFeetToMeters);
}
}
