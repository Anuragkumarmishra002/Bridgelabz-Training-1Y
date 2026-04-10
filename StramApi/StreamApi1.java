package StramApi;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApi1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 != 0)   // remove even numbers
                .map(n -> n * n)           // square each number
                .collect(Collectors.toList());

        System.out.println(result);
    }
}