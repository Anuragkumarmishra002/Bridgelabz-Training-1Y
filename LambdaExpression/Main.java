package LambdaExpression;
// Functional Interface
interface calculator {
    int calculate(int a, int b);
}
// Normal Class Implementations
class Add implements calculator {
    public int calculate(int a, int b) {
        return a + b;
    }
}
class Sub implements calculator {
    public int calculate(int a, int b) {
        return a - b;
    }
}
class Mul implements calculator {
    public int calculate(int a, int b) {
        return a * b;
    }
}
// by using xyz
class xyz {
    static  void calculate( calculator impl , int a , int b ){
     int result =   impl.calculate(a,b);
       System.out.println("Result due to xyz class  " +result);
    }
}
// Main Class
public class Main {

    public static void main(String[] args) {

        //  Using Normal Classes
        calculator add1 = new Add();
        calculator sub1 = new Sub();
        calculator mul1 = new Mul();

        System.out.println("Using Normal Classes ");
        System.out.println("Addition " + add1.calculate(10, 5));
        System.out.println("Subtraction " + sub1.calculate(10, 5));
        System.out.println("Multiplication " + mul1.calculate(10, 5));

        //  Using Lambda Expressions
        calculator add2 = (a, b) -> a + b;
        calculator sub2 = (a, b) -> a - b;
        calculator mul2 = (a, b) -> a * b;

        System.out.println("\n Using Lambda Expressions");
        System.out.println("Addition " + add2.calculate(10, 5));
        System.out.println("Subtraction " + sub2.calculate(10, 5));
        System.out.println("Multiplication " + mul2.calculate(10, 5));

        // Using xyz with Normal Classes
        System.out.println("\nUsing xyz with Normal Classes");
        xyz.calculate( new Add(), 10, 5);
        xyz.calculate( new Sub(), 10, 5);
        xyz.calculate( new Mul(), 10, 5);

//     Using xyz with Lambda
        System.out.println("\nUsing xyz with Lambda");
        xyz.calculate((a, b) -> a + b, 10, 5);
        xyz.calculate((a, b) -> a - b, 10, 5);
        xyz.calculate((a, b) -> a * b, 10, 5);
 }
}