package Level2;
import java.util.Scanner ;
public class MaxOfThree {
    static  int max( int a , int b , int c){
        int max = a;           // assume a as the biggest number
        if (b > max) max = b;  // if b is greater update max
        if (c > max) max = c;  //  if c is greater update max
        return max;
    }
    static int[] takeInput(Scanner sc) {
        System.out.println("Enter number 1 ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 ");
        int b = sc.nextInt();
        System.out.println("Enter number 3 ");
        int c = sc.nextInt();
        return new int[]{a,b,c};
    }
    public static void main(String [ ] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = takeInput(sc);
        int max = max(nums[0], nums[1], nums[2]);
        System.out.println("Maximum number is " +max);
    }
}
