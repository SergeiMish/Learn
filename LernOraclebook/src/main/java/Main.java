import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
     public static void main(String[] args) {
          Predicate<String> empty = String::isEmpty;
          Predicate<String> notEmpty = empty.negate();

          var result = Stream.generate(() ->
                  "")
          24: .filter(notEmpty)
          25: .collect(Collectors.groupingBy(k ->
                  k))
          26: .entrySet()
          27: .stream()
          28: .map(Entry::getValue)
          29: .flatMap(Collection::stream)
          30: .collect(Collectors.partitioningBy(notEmpty));
          31: System.out.println(result);
     }
}
