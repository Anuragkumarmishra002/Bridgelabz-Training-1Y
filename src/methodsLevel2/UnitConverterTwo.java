

package methodsLevel2;
import java.util.Scanner ;
public class UnitConverterTwo extends UnitConverterOne {
    public static double convertYardsToFeet( double yards){
        double yards2feet = 3;
                double feet = yards * yards2feet ;
        return feet ;
    }
    public static double convertFeet2Yards( double feet){
        double feet2yards = 0.333333;
        double yards = feet * feet2yards ;
        return yards ;
    }
    public static double convertMetersToInches( double meters ){
     double meters2inches = 39.3701 ;
     double inches = meters * meters2inches ;
     return inches ;
    }
    public static double convertInches2meter(double inches ){
        double inches2meter = 0.0254 ;
        double meter  = inches * inches2meter;
        return meter ;
    }
    public static double convertInches2Cm( double inches ){
        double inches2cm = 2.54 ;
        double cm = inches * inches2cm ;
        return cm ;
    }
    public static void main(String [] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yards");
        double yards = sc.nextInt();
        System.out.println("Enter feet");
        double feet = sc.nextInt();
        System.out.println("Enter inches");
        double inches = sc.nextInt();
        System.out.println("Enter meter");
        double meter = sc.nextInt();

        double convertedYard = convertYardsToFeet( yards);
        double convertedFeet = convertFeet2Yards( feet);
        double convertedMeter = convertMetersToInches( meter );
        double convertedInches = convertInches2meter(inches );
        double convertedInchesCm =     convertInches2Cm(  inches );

        System.out.println("Yards to Feet " +convertedYard );
        System.out.println("Feet to Yards" + convertedFeet);
        System.out.println("Meters to Inches " +convertedMeter );
        System.out.println("Inches to Meters " + convertedInches);
        System.out.println("Inches to Centimeters  " + convertedInchesCm);
    }
}
