import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            read();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения метода read");;
        }


    }
    public static void read () throws FileNotFoundException {

        File file = new File("21у312");
            Scanner scanner = new Scanner(file);



    }
}
