package streamapi;
import java.util.*;

public class FindSquare {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().map(n -> n * n).forEach(System.out::println);
    }
}