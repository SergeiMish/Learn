import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double roubles = 5000; // сумма на счету
        int yearRate = 4; // годовая процентная ставка
        int numOfMonth = 36; // количество месяцев, на который открыт вклад
        double monthRefill = 1000; // ежемесячное пополнение
				double monthMaintenance = 0.1 * roubles; //плата за обслуживание счёта
				double monthRate = monthRefill % yearRate; // вычислите месячную процентную ставку

        for (int i = 1; i <=12; i++) { // дополните условие цикла
        double depositInterest = roubles * monthRate / 100; // вычислите доход от процентов
            roubles += depositInterest; // добавьте доход от процентов
            roubles += monthRefill; // учтите ежемесячное пополнение
        }

        System.out.println("Через " + numOfMonth + " месяцев накопится " + roubles + " рублей");

        if (roubles >= 41000) { // определите, удалось ли достичь цели
            System.out.println("Ура! Можно идти в магазин за новым объективом!");
        } else {
            System.out.println("Нужно ещё немного подкопить.");
        }
    }
}