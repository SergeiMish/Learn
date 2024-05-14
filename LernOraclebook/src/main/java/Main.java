import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double interestRate = 10;

        System.out.println("Введите начальную сумму в выбранной валюте:");
        double amount = NumberReader.getDouble();

        // посчитайте начальную сумму и сохраните в переменную amount

        System.out.println("Введите количество лет для расчёта:");
        int yers = NumberReader.getInteger();
        // посчитайте количество лет и сохраните в переменную years

        // напишите условие выполнения цикла
        for (int i = 1; i <= yers; i++) {
            amount = amount + amount * (interestRate / 100);
            // формула для суммы за один год на процентную ставку
        }

        // выведите на экран сообщение с итоговой суммой
        System.out.println("К окончанию срока сумма составит: " + amount + " " + "RUB");
    }
}