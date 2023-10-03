import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
     public static void main(String[] args) {
          List<Integer> data = new ArrayList<>();
          IntStream.range(0, 100).parallel().forEach(data::add);
          System.out.println(data.size());
     }
}
