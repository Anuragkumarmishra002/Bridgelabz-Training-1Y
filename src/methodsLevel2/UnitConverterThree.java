/*6. Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do
the following. Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertFarhenheitToCelsius(double farhenheit) =>
a. Method to convert Fahrenheit to Celsius and return the value. Use the following code
double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
b. Method to convert Celsius to Fahrenheit and return the value. Use the following code
double celsius2farhenheit = (celsius * 9 / 5) + 32;
c. Method to convert pounds to kilograms and return the value. Use the following code
double pounds2kilograms = 0.453592;
d. Method to convert kilograms to pounds and return the value. Use the following code
double kilograms2pounds = 2.20462;
e. Method to convert gallons to liters and return the value. Use following code to convert
double gallons2liters = 3.78541;
f. Method to convert liters to gallons and return the value. Use following code to convert
double liters2gallons = 0.264172;*/
package methodsLevel2;
import java.util.Scanner ;
 public class UnitConverterThree extends UnitConverterTwo {
  public static double convertFarhenheitToCelsius(double farhenheit){

      double celsius = (farhenheit - 32) * 5 / 9;;
      return celsius ;
  }
  public static double convertCelsiusToFahrenheit( double celsius ) {

      double farhenheit = (celsius * 9 / 5) + 32; ;
      return farhenheit ;
  }
  public static double convertPoundToKilogram(double pound ){
      double pounds2kilograms = 0.453592;
      double kilograms = pounds2kilograms * pound ;
      return kilograms ;
  }
  public static double convertKilogramsToPound( double kilogram){
      double kilogram2pound =  2.20462;
      double pounds = kilogram2pound * kilogram ;
      return pounds ;
  }
  public static double convertGallonsToLiters( double gallons ){
      double gallons2litres = 3.78541;
      double liters = gallons2litres * gallons ;
      return liters ;
  }
  public static double convertLitresToGallons(double litres ){
      double litres2gallons = 0.264172;
              double gallons =  litres2gallons * litres ;
              return gallons ;
  }
  public static void main(String [] args ){
      Scanner scanner= new Scanner(System.in);
      System.out.println("Enter temperature in Fahrenheit: ");
      double fahrenheit = scanner.nextDouble();
      System.out.println("Enter temperature in Celsius: ");
      double celsius = scanner.nextDouble();
      System.out.println("Enter weight in Pounds: ");
      double pounds = scanner.nextDouble();
      System.out.println("Enter weight in Kilograms: ");
      double kilograms = scanner.nextDouble();
      System.out.println("Enter volume in Gallons: ");
      double gallons = scanner.nextDouble();
      System.out.println("Enter volume in Liters: ");

      double liters = scanner.nextDouble();
      double fToc = convertFarhenheitToCelsius(fahrenheit);
      double cToF = convertCelsiusToFahrenheit(celsius);
      double poundsToKg =convertPoundToKilogram(pounds);
      double kgToPounds = convertKilogramsToPound(kilograms);
      double gallonsToLiters = convertGallonsToLiters(gallons);
      double litersToGallons = convertLitresToGallons(liters);


      System.out.println(fahrenheit + " F = " + fToc + " C");
      System.out.println(celsius + " C = " + cToF + " F");
      System.out.println(pounds + " Pounds = " + poundsToKg + " Kilograms");
      System.out.println(kilograms + " Kilograms = " + kgToPounds + " Pounds");
      System.out.println(gallons + " Gallons = " + gallonsToLiters + " Liters");
      System.out.println(liters + " Liters = " + litersToGallons + " Gallons");
  }
 }
