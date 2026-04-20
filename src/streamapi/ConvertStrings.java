package streamapi;
import java.util.*;
public class ConvertStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "C", "c++");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}