import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String words = scanner.nextLine();
        System.out.println(words.toLowerCase());
    }
}
