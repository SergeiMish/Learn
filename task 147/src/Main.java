import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fileReader = new FileReader("test");
        Scanner scanner = new Scanner(fileReader);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(String.valueOf(scanner.hasNextLine()));


            System.out.println(arrayList);
        }
    }
