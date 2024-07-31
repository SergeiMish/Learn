package ru.yandex.practicum;

public class TransactionValidator {
    // объявите константы
    final static int MIN_AMOUNT = 1;
    final static int MAX_AMOUNT = 5000;

    public static boolean isValidAmount(double amount) {
        if (amount < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
        } else if (amount > MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
        } else {
            return true;
        } return false;
        // объявите метод isValidAmount()
        // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
    }
}