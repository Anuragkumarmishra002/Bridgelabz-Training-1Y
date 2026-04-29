package Generic12;
import java.util.*;

public class Main {

    public static void printNumbersWildcard(List<? extends Number> list) {

        // Using "? extends Number" (Upper Bounded Wildcard)
        List<? extends Number> list2 = new ArrayList<Integer>();
        // list2.add(3.14); // NOT ALLOWED

        // Using "? super Number" (Lower Bounded Wildcard)
        List<? super Number> list3 = new ArrayList<Object>();
        list3.add(42);
        list3.add(3.14);

        System.out.println(list3);

        for (Number num : list) {
            System.out.println(num.doubleValue());
        }
    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 20, 30);
        printNumbersWildcard(nums);

        Box<String> stringBox = new Box<>();
    }
}