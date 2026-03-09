package methodsLevel3;
import java.util.Scanner;
public class NumberChecker1 {
    public static int countDigits(int number) {
        int countNo = 0;
        while (number > 0) {
            number = number / 10;
            countNo++;
        }
        return countNo;
    }
    public static int[] arrayStore(int number, int countNo) {
        int[] arrayStoreNo = new int[countNo];
        int temp = number;
        for (int i = countNo - 1; i >= 0; i--) {
            arrayStoreNo[i] = temp % 10;
            temp = temp / 10;
        }
        return arrayStoreNo;
    }
    public static boolean isDuckNumber(int[] arrayStoreNo) {
        for (int i = 1; i < arrayStoreNo.length; i++) {
            if (arrayStoreNo[i] == 0) {
                return true;
            }
        }

        return false;
    }
    public static boolean isArmstrong(int[] arrayStoreNo, int countNo, int number) {
        int sum = 0;
        for (int i = 0; i < arrayStoreNo.length; i++) {
            sum = sum + (int) Math.pow(arrayStoreNo[i], countNo);
        }
        return sum == number;
    }
    public static void largestAndSecondLargest(int[] arrayStoreNo) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arrayStoreNo.length; i++) {

            if (arrayStoreNo[i] > largest) {
                secondLargest = largest;
                largest = arrayStoreNo[i];
            }
            else if (arrayStoreNo[i] > secondLargest && arrayStoreNo[i] != largest) {
                secondLargest = arrayStoreNo[i];
            }
        }
        System.out.println("Largest Digit " + largest);
        System.out.println("Second Largest Digit " + secondLargest);
    }
    public static void smallestDigits(int[] arrayStoreNo) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arrayStoreNo.length; i++) {

            if (arrayStoreNo[i] < smallest) {
                secondSmallest = smallest;
                smallest = arrayStoreNo[i];
            }
            else if (arrayStoreNo[i] < secondSmallest && arrayStoreNo[i] != smallest) {
                secondSmallest = arrayStoreNo[i];
            }
        }

        System.out.println("Smallest Digit " + smallest);
        System.out.println("Second Smallest Digit " + secondSmallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        int countNo = countDigits(number);
        int[] digits = arrayStore(number, countNo);
        if (isDuckNumber(digits)) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }
        if(isArmstrong(digits, countNo, number)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        largestAndSecondLargest(digits);
        smallestDigits(digits);
    }
}