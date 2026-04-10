package StramApi;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class PreDefinedFunctional {

        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
            Predicate<Integer> isOdd = n -> n % 2 != 0;
            Function<Integer, Integer> square = n -> n * n;
            Consumer<Integer> print = n -> System.out.println(n);
            list.stream()
                    .filter(isOdd)
                    .map(square)
                    .forEach(print);
        }
    }

