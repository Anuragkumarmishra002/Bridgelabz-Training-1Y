package lambda;
public class LambdaSub {
    public static void main(String[] args) {
        Calculator sub = (a, b) -> a - b;
        System.out.println(sub.calculate(10, 4));
    }
}