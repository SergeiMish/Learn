import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String word = scanner.nextLine();
        if (word.startsWith("Правда")){
            System.out.println("Правильно");
        }
    }
}
