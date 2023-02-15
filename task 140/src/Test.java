import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        String path = separator + "C:" + separator + "Users" + separator + "HP M" + separator + "Desktop" + separator + "Текстовый документ.txt";
        File file = new File(path);


        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");

        int[] numbers = new int[5];
        int counter = 0;


        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);

            System.out.println(Arrays.toString(numbers));


            scanner.close();
        }
    }
}
