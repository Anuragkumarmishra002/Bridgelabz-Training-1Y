package methodsLevel2;
import java.util.Scanner ;
class  SumCompareWithRecursion {
    public static int sumRecursion(int number ){
          if(number == 1){
              return 1 ;
          }
          return number + sumRecursion(number-1);
    }
    public static int sumNormal( int number ){
        int sum = number * (number + 1)/2 ;
        return sum ;
    }
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        int resultRecursion = sumRecursion(number);
        int resultNormalSum = sumNormal(number );
        System.out.println("The sum via recursion is " +resultRecursion + " and the sum via formula is " +resultNormalSum );
        if( resultRecursion == resultNormalSum){
            System.out.println("Yes both results are correct and equal");

        }
        else {
            System.out.println("No both results are not equal and correct");
        }
    }
}
