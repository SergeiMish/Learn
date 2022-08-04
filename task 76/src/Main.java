import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "C:" + separator + "Users"
                + separator + "HP M"+ separator + "Desktop"
                + separator +"Текстовый документ.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] names = line.split(" ");
        int[] numbers = new int [8];
        int counter = 0;

        for (String number : names) {
            numbers[counter++] = Integer.parseInt(number);
        }
            System.out.println(Arrays.toString(numbers));
        scanner.close();
        }

    }
//"C:\Users\HP M\Desktop\Текстовый документ.txt"