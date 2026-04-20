package lambda;

interface Calculator {
    int calculate(int a, int b);
}
public class LambdaAdd {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println(add.calculate(5, 3));
    }
}