
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> table = new ArrayList<>();
        for (int i=0; i <10; i++){
            table.add(i);
        }

        int index = Arrays.binarySearch(new List[]{table}, 5);
        System.out.println(table);
    }
}
