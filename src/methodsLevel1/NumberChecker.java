package methodsLevel1;
  import java.util.Scanner ;
   class NumberChecker {
     public int check( int number ) {
         if (number > 0) {
             return 1;
         } else if  ( number < 1) {
             return -1;
         } else {
             return 0;
         }
     }
     public static void main (String[] args) {
       Scanner sc =  new Scanner(System.in);
         System.out.println("Enter the number ");
       int number = sc.nextInt();

       NumberChecker obj = new NumberChecker();
       int result = obj.check(number);
       if( result  == 1) {
           System.out.print("The number is positive ");

       }
       else if ( result == -1) {
           System.out.print("The number is negative"); }
           else  {
               System.out.print("The number is zero");
       }

     }
}
