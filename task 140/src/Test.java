import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "C:" + separator + "Users" + separator + "HP M" + separator + "Desktop" + separator + "Текстовый документ.txt";
        File file = new File(path);
        String names;

        List<String> fio = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            names = scanner.nextLine();
            fio.add(names);

        }
        System.out.println(fio.toString());

        for (String allFio : fio){
            System.out.println(allFio);
        }

        scanner.close();
    }
}
//"C:\Users\HP M\Desktop\Текстовый документ.txt"