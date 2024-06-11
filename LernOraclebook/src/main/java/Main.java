import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // объявите пустой массив трат за неделю (7 дней)
        int[] expenses = new int[7];

        Random random = new Random(); // Генерирует случайное число

        // допишите условие цикла for, чтобы заполнить массив случайными тратами
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(1000);
        }

        System.out.println("Траты за неделю:");
        // выведите с помощью цикла все траты за неделю в виде: "День ... . Потрачено рублей: ..."


        int sum = 0;
        // посчитайте и выведите сумму трат за неделю — используйте цикл и здесь
        ...

        System.out.println("Траты в рублях за неделю: " + ...);
    }
}