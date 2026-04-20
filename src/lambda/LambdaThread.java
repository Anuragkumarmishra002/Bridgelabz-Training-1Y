package lambda;
public class LambdaThread {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Thread running");
        new Thread(r).start();
    }
}