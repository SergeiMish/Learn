import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(); // генерирует случайное число
        int secretCode;
        int pilotInput;

        // добавьте цикл - ракета летает бесконечно
        while (true){
            secretCode = random.nextInt(100); // здесь задаётся код - случайное число от 0 до 100
            System.out.println("Ракета SpaceY на орбите!");
            pilotInput = random.nextInt(100); // пилот пытается угадать код

            if (secretCode == pilotInput) { // если пилот угадал код, то цикл должен завершиться
                System.out.println("Пилот угадал число! Домой!");
                break;
            }
        }

    }
}