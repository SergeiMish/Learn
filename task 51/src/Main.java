import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        System.out.println(number1 + "-" + number2 + "=" + (number1-number2) +
                "\n" + number1 + "+" + number2 + "=" + (number1+number2) +
                "\n" + number1 + "*" + number2 + "=" + (number1*number2) +
                "\n" + number1 + "/" + number2 + "=" + (number1/number2) +
                "\n" + number1 + "%" + number2 + "=" + (number1%number2));
    }
}
