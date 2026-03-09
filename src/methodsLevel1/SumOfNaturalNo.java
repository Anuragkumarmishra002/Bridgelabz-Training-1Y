package methodsLevel1;
import java.util.Scanner ;
public class SumOfNaturalNo {
    public int sumOfNum(int number ) {
        int sum = 0;
        for(int i = 1 ; i <= number ; i++) {
            sum = sum + i ;

        }
        return sum ;
    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
            SumOfNaturalNo obj = new  SumOfNaturalNo();
            int result = obj.sumOfNum(number);
            System.out.println("The sum of n natural numbers is " + result);
        }
}
