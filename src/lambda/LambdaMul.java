package lambda;
public class LambdaMul {
    public static void main(String[] args) {
        Calculator mul = (a, b) -> a * b;
        System.out.println(mul.calculate(6, 7));
    }
}