package streamapi;
import java.util.*;
public class FindMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 5, 40);
        int max = list.stream().max(Integer::compare).get();System.out.println(max);
    }
}