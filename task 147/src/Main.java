import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int x = 44;
        int low;
        int high;
        int index = -1;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        high = numbers.lastIndexOf(numbers);
        low = numbers.indexOf(numbers);
        System.out.println(numbers);

        while (high <= low) {
            int mid = low + (high - low) / 2;
            if (mid != x) {
                low = mid + 1;
            } else if (mid > x) {
                high = mid - 1;
            } else if (mid == x) {
                index = mid;
                break;
            }
        }
    }
}

