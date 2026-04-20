package streamapi;
import java.util.*;

public class CountStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Aman", "Anu", "Shiv", "Anshu");
        long count = list.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(count);
    }
}