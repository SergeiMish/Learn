import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] expenses = {100.50, 500.00, 10.00, 0.0, 640.60, 370.20, 200.00};

        // Добавьте 115 рублей к расходам за среду
        expenses[2]  = 125.0;
        System.out.println("Новое значение расходов за среду: " + expenses[2] + "рублей.");

        // Суммируйте три самые крупные траты
        double sum = expenses[1] + expenses[5] + expenses[6];
        System.out.println("Самые большие расходы были во вторник, пятницу и субботу.");
        System.out.println("Всего вы потратили в эти дни: " + sum + " рублей.");
    }
}