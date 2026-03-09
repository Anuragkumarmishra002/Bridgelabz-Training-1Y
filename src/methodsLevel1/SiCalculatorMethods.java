package methodsLevel1;
import java.util.Scanner  ;
 class SiCalculatorMethods {
   public double siCalculator(double principal , double rate  ,  double time) {
       double si = (principal * rate * time)  / 100  ;
       return si ;
   }
   public static  void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the principal");
       double principal = sc.nextDouble();
     System.out.println("Enter the rate ")  ;
     double rate = sc.nextDouble();
     System.out.println("Enter the time ");
      double time = sc.nextDouble();
       SiCalculatorMethods obj = new SiCalculatorMethods();
      double result =  obj.siCalculator(principal , rate , time ) ;
       System.out.println("The Simple Interest is " + result + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
   }
}
