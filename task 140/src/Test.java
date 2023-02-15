import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        String path = separator + "C:" + separator + "Users" + separator + "HP M" + separator + "Desktop" + separator + "Текстовый документ.txt";
        File file = new File(path);
        String names;

//        List<Integer> fio = new ArrayList<>();
//        file = (File) Files.readAllLines(path);
//
//        System.out.println(fio.toString());


        Scanner scanner = new Scanner(file);
        String line  = scanner.nextLine();

        }

        int[] numbers = new int[5];
        int counter = 0;


        for (Integer allFio : fio){
            numbers[counter++] = Integer.parseInt(String.valueOf(allFio));

            System.out.println(Arrays.toString(numbers));
//        }
//
//        scanner.close();
    }
}
