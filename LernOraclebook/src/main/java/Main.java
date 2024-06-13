import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        while (true) {
            System.out.println("Когда планируется путешествие? Введите номер месяца от 1 до 12.");
            monthNumber = scanner.nextInt();

            if (monthNumber <= 12) { // Инвертируйте условие
                break;
            } else {
                System.out.println("Некорректный номер месяца. Введите ещё раз.");
            }
        }
        String season = "";
        // Допишите условия ветвления в виде утверждений
        if (monthNumber  < 3) {
            season = "Зима";
        } else if (monthNumber  < 6) {
            season = "Весна";
        } else if (monthNumber  < 9) {
            season = "Лето";
        } else if (monthNumber  < 12) {
            season = "Осень";
        } else {
            season = "Зима";
        }
        for (int i = 1; i < 12; i++){
            /* Допишите ветвление, которое будет печатать строку:
            System.out.println("Летом лучше остаться в Москве.");
              и завершать выполнение программы */
        }

        else {
            System.out.println("Укажите стоимость прямых билетов из Москвы в Париж:");
            int ticketMoscowParis = scanner.nextInt();
            System.out.println("Укажите стоимость билетов из Москвы в Париж с пересадкой в Лондоне:");
            int ticketMoscowLondonParis = scanner.nextInt();
            System.out.println("У вас есть британская виза?");
            System.out.println("1 - да, виза есть");
            System.out.println("0 - визы нет");
            int britainVisa = scanner.nextInt();


            // В этом ветвлении что-то напутано с условиями - исправьте это
            if (!season.equals("Лето")) { // Перенесите проверку на "Лето" выше
                if (!(ticketMoscowLondonParis < ticketMoscowParis)) {
                    if (!(britainVisa == 0)) { // Упростите это условие
                        System.out.println("Летим через Лондон!");
                    } else {
                        System.out.println("Летим напрямую в Париж!");
                    }
                } else {
                    System.out.println("Летим напрямую в Париж!");
                }
            }
        }
    }
}