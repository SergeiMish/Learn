import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создайте переменную Scanner

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble(); // объявите переменную moneyBeforeSalary и используйте нужный метод класса Scanner

        // сравнивайте значение  переменной moneyBeforeSalary со значениями в условии, чтобы получить необходимый результат
        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома.");
        } else if (moneyBeforeSalary >= 3000 && moneyBeforeSalary < 10000) {
            System.out.println("Можно заказать пиццу!");
        } else if (moneyBeforeSalary >= 10000 && moneyBeforeSalary < 30000) {
            System.out.println("Неплохо! Сегодня можно поужинать в кафе.");
        } else if (moneyBeforeSalary >= 30000) {
            System.out.println("Отлично! Можно сходить в ресторан.");  // остальные варианты
        }
    }
}
