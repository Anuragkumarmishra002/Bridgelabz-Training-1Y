package methodsLevel1;
import java.util.Scanner ;
 class SpringChecker {
     public boolean springCheck(int month , int day) {
        if ( month == 3 && day >=20 || month == 4 || month ==5 || month ==6 && day <= 20)
            return true ;
            else
                return false ; }
        public static void main(String[] args){
         Scanner sc =  new Scanner(System.in);
         System.out.println ("Enter the month ");
         int month = sc.nextInt();
         System.out.println("Enter the day ");
         int day = sc.nextInt();
         SpringChecker obj = new SpringChecker();
         boolean result = obj.springCheck(month ,  day);
         if(result ){
             System.out.println("Spring Season"); }
             else {
                 System.out.println("Not A Spring  Season");
         }
     }
}
