import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Число возведено в степень 4 и равняется: " + Math.pow(number, 4));
    }
}
