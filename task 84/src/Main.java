import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String[]word = words.split("[ ]+");
        System.out.println("Предпоследнее слово: " + word[word.length -2]);

    }
}
