package StramApi;
import java.util.*;

public class Filter  {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> oddList = list.stream()
                .filter(n -> n % 2 != 0)  // keep only odd numbers
                .toList();

        System.out.println(oddList);
    }
}