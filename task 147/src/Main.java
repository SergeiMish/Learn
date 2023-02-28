import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int valueToFind = 44;
        int[] values = {1, 1, 2, 3, 4, 10};
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.printf("Index = %d%n", binarySearch(values, valueToFind, 0, values.length - 1));

    }
    private static int binarySearch(int[] sortedArray, int valueToFind, int low, int high) {
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }
            }

