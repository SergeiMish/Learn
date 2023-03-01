
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = i * j;
            }
        }
            for (int[] numbers : table) {
                System.out.println(Arrays.toString(numbers));
            }
        }
    }
