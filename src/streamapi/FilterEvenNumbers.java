package streamapi;
import java.util.*;
import java.util.stream.*;
public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}