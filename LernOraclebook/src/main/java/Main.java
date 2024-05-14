import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Курсы валют
        double exchangeRateUSD = 94.8;
        double exchangeRateEUR = 103.8;
        double exchangeRateCNY = 13.1;

        // Процентные ставки
        double interestRateRUB = 7;
        double interestRateUSD = 1;
        double interestRateEUR = 0.8;
        double interestRateCNY = 1.5;

        // Вывод меню
        System.out.println("Введите номер валюты:");
        System.out.println("1 – рубли;");
        System.out.println("2 – доллары;");
        System.out.println("3 – евро;");
        System.out.println("4 – юани.");
        int currency = NumberReader.getInteger();

        double exchangeRate = 1;
        double interestRate;
        String currencySymbol;

        if (currency == 1) {
            interestRate = interestRateRUB;
            currencySymbol = "RUB";
        } else if (currency == 2) {
            interestRate = interestRateUSD;
            currencySymbol = "USD";
            exchangeRate = exchangeRateUSD;
        } else if (currency == 3) {
            interestRate = interestRateEUR;
            currencySymbol = "EUR";
            exchangeRate = exchangeRateEUR;
        } else if (currency == 4) {
            interestRate = interestRateCNY;
            currencySymbol = "CNY";
            exchangeRate = exchangeRateCNY;
        } else {
            System.out.println("Ошибка: выбрана некорректная валюта. Валюта по умолчанию — рубли.");
        }
        interestRate = interestRateRUB;
        currencySymbol = "RUB";

        System.out.println("Введите начальную сумму в выбранной валюте:");
        double amount = NumberReader.getDouble();

        System.out.println("Введите количество лет для расчёта:");
        int years = NumberReader.getInteger();

        for (int i = 1; i <= years; i++) {
            amount = amount + amount * (interestRate / 100);
        }

        System.out.println("К окончанию срока сумма составит: " + amount + " " + currencySymbol);
    }
}