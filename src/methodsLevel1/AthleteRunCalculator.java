package methodsLevel1;
import java.util.Scanner ;
 class AthleteRunCalculator {
    public double Run( double side1 , double side2 , double side3 ) {
        double perimeter = side1 + side2 + side3 ;
        double totalDistance =  5000 ;
        double totalRounds =  totalDistance / perimeter  ;
        return totalRounds ;
        }
        public static void main(String [] args){
       Scanner sc =  new Scanner(System.in) ;
       System.out.println("Enter side 1 ");
        double  side1 = sc.nextDouble();
            System.out.println("Enter side 2");
            double side2 = sc.nextDouble();
            System.out.println("Enter side 3 ");
           double side3 = sc.nextDouble();
            AthleteRunCalculator obj = new AthleteRunCalculator();
            double result = obj.Run(side1 , side2 , side3) ;
            System.out.println("Number of rounds to complete 5km: " + result);
        }

 }