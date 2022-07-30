import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите пароль");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Ваш пароль "+ number);
    }
}
