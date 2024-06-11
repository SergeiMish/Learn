import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] expenses = new double[7]; // объявили массив трат за неделю (7 дней)

       int expense = 50; // в первый день потрачено 50 рублей

        // заполнили массив, используя цикл for
        for (int i = 1; i < expenses.length; i++) {
            expenses[i] = expense;
            expense = expense + 100;
        }
        System.out.println("Ошибок нет. Все расходы успешно занесены в приложение!");
    }
}