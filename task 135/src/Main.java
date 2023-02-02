import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int []numbers = new int[10];
        Random rran = new Random();
        numbers = rran.ints().limit(numbers.length).toArray();
        System.out.println("Рандомные числа: ");
            System.out.println(Arrays.toString(numbers));
    }
}