import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        File file = new File("asdlasd");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("Файл считан");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден, укажите правильный путь");
        }


    }
}
