package StramApi;

import java.util.Arrays;
import java.util.List;

public class Age {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(18, 20, 30, 40, 5, 6);
        List<Integer> AgeList = list.stream()
                .filter(n -> n >= 18 )  // keep only people older than 18
                .toList();
        System.out.println(AgeList);
    }
}
