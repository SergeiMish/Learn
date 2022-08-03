import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чило: ");
        int val = scanner.nextInt();
        int [] result = factorsOf(val);
        System.out.println("\nМножители числа " + val + ":");
        for(int i = 1; i < result.length && result[i] != 0; i ++){
            System.out.println(result[i] + " ");
        }
    }

    static int[] factorsOf(int val) {
        int limit = (int) Math.ceil(Math.sqrt(val));
        int [] numArray = new int[limit];
        int index = 0;

        for (int i = 1; i <= limit; i++) {
            if (val % i == 0) {
                numArray[index++] = i;
                val /= i;
            }
        }
        numArray[index] = val;
        return numArray;
    }
}