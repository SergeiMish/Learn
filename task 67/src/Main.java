import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите значение: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int result = Integer.parseInt(number);
                System.out.println("Целочисленное значение: " + result);
    }
}
