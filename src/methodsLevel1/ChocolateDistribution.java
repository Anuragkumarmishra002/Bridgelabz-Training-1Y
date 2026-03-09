package methodsLevel1;
import java.util.Scanner  ;
public class ChocolateDistribution {
    public static int [] distributeChocolate( int chocolate , int children ){
        int rem = chocolate % children ;
        int eachChild= chocolate / children ;
        return new int [] { eachChild , rem };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of chocolates  ");
        int chocolate = sc.nextInt();
        System.out.println("Enter the number of children  ");;
        int children = sc.nextInt();
        int [] result = distributeChocolate(  chocolate , children );

        System.out.println("Each child gets " + result[0]);
        System.out.println("Remaining chocolates " + result[1]);
    }
}
