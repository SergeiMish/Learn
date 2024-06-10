import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price = 256;
        int totalMonths = 12;

        double totalCost = 0;
        Scanner scanner = new Scanner(System.in);
        double mea = scanner.nextDouble();
        // опишите условие цикла.
        // в качестве переменной итерирования можно использовать переменную month
        for (int month = 1; month <= totalMonths; month++) {
            if (month % 3 == 0){
                price = price / 2;
            }
            totalCost = totalCost +price;
            // Подсчитайте сумму с учётом изменения цены каждый третий месяц
        }

        System.out.println("Общая стоимость за " + totalMonths + " месяцев: " + totalCost + " руб.");
    }
    }
