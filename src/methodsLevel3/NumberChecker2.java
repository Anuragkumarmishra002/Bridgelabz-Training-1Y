
import java.util.Scanner ;
public class NumberChecker2 {
    public static  int count( int number){
        int countDigit = 0 ;
        while(number!=0){
            number = number / 10;
            countDigit++;

        }
        return countDigit ;
    }
    public static  int []storeArray(int number , int countDigit){
        int [] storeArrayDigits = new int [countDigit];
        for( int i = countDigit -1  ; i  >= 0; i--){
            storeArrayDigits[i] = number % 10;
                    number = number / 10 ;
        }
        return storeArrayDigits ;
    }
    public static int sumArray( int [] storeArrayDigits, int countDigit){
        int sum = 0 ;
        for( int i = 0 ; i < countDigit ; i++ ){
            sum =  sum + storeArrayDigits[i];
        }
        return sum ;
    }
    public static int sumSquareDigits(int number , int [] storeArrayDigits){
        int sumSquare = 0 ;
        for( int i = 0 ; i < storeArrayDigits.length ; i++  ){
            sumSquare = sumSquare + (int)Math.pow(storeArrayDigits[i] , 2 );
        }
        return sumSquare ;
    }
    public static boolean harshadNumber( int [] storeArrayDigits , int sumArray , int number ) {
        return  number % sumArray == 0 ;
    }

    public static int [][] findFreq( int [] storeArrayDigit ) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // digit
            freq[i][1] = 0; // frequency
        }
        for (int i = 0; i < storeArrayDigit.length; i++) {
            int digit = storeArrayDigit[i];
            freq[digit][1]++;
        }
        return freq;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = sc.nextInt();


        int countDigit = count(number);

        int[] storeArrayDigits = storeArray(number, countDigit);

        int sum = sumArray(storeArrayDigits, countDigit);
        System.out.println("Sum of digits " +sum);

        // sum of squares of digits
        int sumSquare = sumSquareDigits(number, storeArrayDigits);
        System.out.println("Sum of square of digits " +sumSquare);


        if(harshadNumber(storeArrayDigits, sum, number)){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
        int[][] freq = findFreq(storeArrayDigits);

        System.out.println("\nDigit Frequency");

        for(int i = 0; i < freq.length; i++){
            if(freq[i][1] > 0){
                System.out.println("Digit " + freq[i][0] + " = " + freq[i][1]);
            }
        }

    }
}
