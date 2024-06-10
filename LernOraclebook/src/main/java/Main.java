import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Круг " + i);
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++)
                    System.out.println("  Приседаем " + j);
            } else if (i % 3 == 0) {
                for (int k = 1; k <= 3; k++) {

                    System.out.println("  Отжимаемся " + k);
                }
            }
            for (int l = 1; l <= 7; l++) {
                System.out.println("  Качаем пресс " + l);
            }
            System.out.println("Хороший темп, так держать!");

            System.out.println("Отлично позанимались сегодня! Вы - молодец!");
        }
    }
}