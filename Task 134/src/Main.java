import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Введите второе число ");
        int y = scanner.nextInt();
        System.out.println("Выберите операцию:\n 1.Сложение \n 2.Вычитание \n 3.Умножение \n 4.Деление");

        int operation = scanner.nextInt();
        switch (operation) {
            case 1 :
                System.out.println(x + y);
                break;
            case 2 :
                System.out.println(x-y);
                break;
            case 3 :
                System.out.println(x*y);
                break;
            case 4 :
                System.out.println(x/y);
                break;
            default:
                System.out.println("Вы выбрали несуществующую операцию");
                   }
    }
}
