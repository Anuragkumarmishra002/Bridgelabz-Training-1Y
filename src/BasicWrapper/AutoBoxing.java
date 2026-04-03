package BasicWrapper;

import java.util.ArrayList;

public class AutoBoxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of numbers = " + sum);
    }
}
