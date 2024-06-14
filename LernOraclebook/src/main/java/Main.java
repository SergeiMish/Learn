import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        while (true) {
            System.out.println("Когда планируется путешествие? Введите номер месяца от 1 до 12.");
            monthNumber = scanner.nextInt();

            if (monthNumber >= 1 && monthNumber <= 12) { // Номер месяца должен быть в диапазоне от 1 до 12
                break;
            } else {
                System.out.println("Некорректный номер месяца. Введите ещё раз.");
            }
        }

        String season = "Зима";
        // Допишите условия ветвления в виде утверждений
        if (monthNumber < 6) {
            season = "Весна";
        } else if (...) {
            season = "Лето";
        } else if (...) {
            season = "Осень";
        }

        if (...) { // Не рекомендуем лететь в Париж в летние и зимние месяцы
            System.out.println("В этом сезоне лучше остаться в Москве.");
            return;
        }


        System.out.println("Укажите стоимость прямых билетов из Москвы в Париж:");
        int ticketMoscowParis = scanner.nextInt();
        System.out.println("Укажите стоимость билетов из Москвы в Париж с пересадкой в Лондоне:");
        int ticketMoscowLondonParis = scanner.nextInt();
        System.out.println("У вас есть британская виза?");
        System.out.println("1 - да, виза есть");
        System.out.println("0 - визы нет");
        int britainVisa = scanner.nextInt();

        boolean directTicketsCheaper = ... // Сравнение стоимости билетов
        boolean hasBritainVisa = ... // Проверка наличия визы

        if (...) { // Проверить в одном условии наличие дешёвых билетов и визы
            System.out.println("Летим через Лондон!");
        } else {
            System.out.println("Летим через Париж!");
        }
    }
}