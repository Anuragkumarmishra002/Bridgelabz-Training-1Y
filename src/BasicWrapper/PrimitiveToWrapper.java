package BasicWrapper;
import  java.util.Scanner ;
public class PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int primitiveValue = sc.nextInt();
        Integer wrapperValue = Integer.valueOf(primitiveValue);
        System.out.println("Primitive value: " + primitiveValue);
        System.out.println("Wrapper object value: " + wrapperValue);
        sc.close();
    }
}