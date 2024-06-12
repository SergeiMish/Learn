import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ниже объявите пустой массив expenses для записи трат за неделю
        double [] expenses = new double[7];

        double rateUSD = 94.8;
        double rateEUR = 103.8;
        double rateCNY = 13.1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 — Конвертировать валюту");
            System.out.println("2 — Получить совет");
            System.out.println("3 — Ввести трату"); // Допишите вывод нового пункта меню
            System.out.println("0 — Выход");

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - CNY.");
                int currency = scanner.nextInt();
                if (currency == 1) {
                    System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
                } else if (currency == 2) {
                    System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
                } else if (currency == 3) {
                    System.out.println("Ваши сбережения в юанях: " + moneyBeforeSalary / rateCNY);
                } else {
                    System.out.println("Введена неизвестная валюта.");
                }
            } else if (command == 2) {
                if (moneyBeforeSalary < 3000) {
                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                } else if (moneyBeforeSalary < 10000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Можно заказать пиццу!");
                    } else {
                        System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                    }
                } else if (moneyBeforeSalary < 30000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Неплохо! Сегодня можно поужинать в кафе. :)");
                    } else {
                        System.out.println("Можно заказать пиццу!");
                    }
                } else {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Отлично! Можно сходить в ресторан.");
                    } else {
                        System.out.println("Неплохо! Сегодня можно поужинать в кафе. :)");
                    }
                }
            } else if (...) { // ещё одно ветвление для обработки новой команды, допишите его условие
                // допишите код для печати сообщения для пользователя
                // текст сообщения: "За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?"
								...
                // получите из консоли день, за который пользователь хочет указать расходы
                int day = ...
                System.out.println("Введите размер траты:");
                // получите из консоли значение расходов и сохраните в переменной expense
				        ...
                // сохраните полученное значение дневных трат в массив expenses
                // не забудьте прибавить новое значение к уже существующим тратам
				        ...
                System.out.println("Значение сохранено!");

            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}