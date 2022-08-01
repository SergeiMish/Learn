import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();
        System.out.println("Правда " +numbers(a, b, c));
    }
        public static boolean numbers(int ax, int bx, int cx){
        return ((ax + bx) == cx);

        }

    }