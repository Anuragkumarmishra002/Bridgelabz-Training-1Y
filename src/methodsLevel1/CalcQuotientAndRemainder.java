package methodsLevel1;
import java.util.Scanner ;
class CalcQuotientAndRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int reminder = number % divisor ;
        int quotient = number / divisor ;
        return new int [] { reminder , quotient} ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        System.out.println("Enter the divisor ");
        int divisor = sc.nextInt();
        CalcQuotientAndRemainder obj = new CalcQuotientAndRemainder ();
        int [] result  = obj.findRemainderAndQuotient( number, divisor);
        System.out.println("Quotient " + result[1]);
        System.out.println("Remainder " + result[0]);
    }
}