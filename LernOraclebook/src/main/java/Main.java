import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] expenses = new double[7];

        double expense = 50; // в первый день потрачено 50 рублей

        // заполнили массив, используя цикл for
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = expense;
            expense = expense + 100;
        }
        System.out.println("Расходы за неделю успешно занесены в приложение!");

        Scanner scanner = new Scanner(System.in);
        while (true) { // добавили бесконечный цикл — теперь не страшно ошибаться много раз
            System.out.println("Расходы за какой день вы хотите проверить. Выберите значение от 0 (пн) до 6 (вс).");
            // считайте ввод пользователя из консоли и сохраните в переменной index
            int index = scanner.nextInt();

            // проверьте, не допущена ли ошибка
            if (index < 0) {
                System.out.println("Выбрано неверное значение! Минимальное значение - 0");
            }
            // если значение меньше нуля,
            // напечатайте "Выбрано неверное значение! Минимальное значение - 0"
            else if (index >= expenses.length)
                System.out.println("Выбрано неверное значение! Максимальное значение - " + (expenses.length - 1));
                // если выбрано значение больше длины массива или равное ей,
                // напечатайте "Выбрано неверное значение! Максимальное значение - " + ...
            else if (index < expenses.length) {
                // если пользователь ввёл корректный индекс,
                // то программа должна вывести значение нужного элемента и завершить работу (прервать цикл)
                System.out.println("Потрачено " + expenses[index] + " рублей");
                break;
            }
        }
    }
}