import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        System.out.println("Наибольшее из чисел 3 и 5 = " + findMax());
        // напишите аналогичный вызов метода findMax для таких пар чисел: 16 и 5, -1 и -7
        System.out.println("Наибольшее из чисел 16 и 5 = " + findMax());
        System.out.println("Наибольшее из чисел -1 и -7 = " + findMax());
    }

    public static int findMax() {
        int a = 5;
        int b = 3;
        if (a > b) {
            return a;
        }
        return b;
    }

}