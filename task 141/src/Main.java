import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScannerException {
        System.out.println("Введите 0");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                throw new ScannerException();
            }
        }
    }
}