import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int x = 44;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
            System.out.println(numbers);
        }
    }

        BinarySearch bc = new BinarySearch();



    }
        class BinarySearch {
            int binarySearch(ArrayList<Integer> numbers, int x) {
                int left = 0;
                int right = numbers.size() - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (numbers.get(mid) == x) {
                        return mid;
                    }
                    if (numbers.get(mid) < x) {
                        left = mid + 1;
                    } else if (numbers.get(mid) > x) {
                        right = mid - 1;
                    }
                    return -1;
                }
            }
        }