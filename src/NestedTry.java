import java.util.* ;
public class NestedTry {
public static void main(String[] args){

    int [] arr = { 1 , 2,3, };
    System.out.println("The Array contains 3 elements which are " +arr[0]+ ","+arr[1]+","+arr[2]);
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter The Index you want to access it starts from 0 ");
    int index = sc.nextInt();
    System.out.println("Enter the Divisor ");
    int divisor = sc.nextInt();
    try {
        int digit = arr[index];
        try {
            int result = digit / divisor ;
            System.out.println("The result is "+  result );

        }
        catch ( ArithmeticException e){
            System.out.println("Cannot divide by zero ");
        }

    } catch ( ArrayIndexOutOfBoundsException e ){
        System.out.println("Array index is out of bound ");
    }
}
}
