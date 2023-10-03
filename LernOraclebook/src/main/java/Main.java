import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
     public static void main(String[] args) {
          Predicate<String> empty = String::isEmpty;
          Predicate<String> notEmpty = empty.negate();

          var result = Stream.generate(() ->
                  "")
          .filter(notEmpty)
          .collect(Collectors.groupingBy(k ->
                  k))
          .entrySet()
          .stream()
          .map(Entry::getValue)
          .flatMap(Collection::stream)
          .collect(Collectors.partitioningBy(notEmpty));
          System.out.println(result);
     }
}
