import java.util.Scanner;
public class  FactorsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer = ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Error Only positive integers are allowed");
            sc.close();
            return;
        }
        int max = 10;
        int[] factor = new int[max];
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (count == max) {
                    max *= 2;
                    int[] temp = new int[max];
                    for (int j = 0; j < count; j++) {
                        temp[j] = factor[j];
                    }
                    factor = temp;
                }
                factor[count++] = i;
            }
        }
        System.out.print("Factors of "+ num +" are ");
        for (int i = 0; i < count; i++) {
            System.out.print(factor[i] +  " ");
        }
        System.out.println();
        sc.close();
    }
}
