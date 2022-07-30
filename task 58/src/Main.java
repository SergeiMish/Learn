import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number + " + " + number*11 + " + " + number*111);

    }
}
