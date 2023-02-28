import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int x = 44;
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        BinarySearch bc = new BinarySearch();
        int result = bc.binarySearch(numbers, 44);
        System.out.println("Наш массив " + numbers);
        if (result == -1){
            System.out.println("Элемент не найден");
        }
        else System.out.println("Искомое число " + x + ", найдено найдено число " + result);

    }
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
                }return -1;
            }
        }