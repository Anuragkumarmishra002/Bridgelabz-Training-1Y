import java.util.Scanner;
class GreatestFactorWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        int factor = 1;
        int i = num - 1;
        while(i >= 1){
            if(num % i == 0){
                factor = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest factor of " + num + " besides itself is: " + factor);
    }
}
