import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            printMenu();

            int cmd = scanner.nextInt();
            if (cmd == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (cmd == 2) {
                stepTracker.changeStepGoal();
            } else if (cmd == 3) {
                stepTracker.printStatistic();
            } else if (cmd == 4) {
                System.out.println("Вы завершили программу! Хорошего дня!");
                break;
            } else {
                System.out.println("Вы ввели неверную команду. Необходимо выбрать цифру от 1 до 4. Вы ввели " + cmd);
                System.out.println();
            }
        }
    }

    static void printMenu() {
        System.out.println("Введите необходимую команду");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Изменить цель по количеству шагов в день");
        System.out.println("3. Напечатать статистику за определённый месяц");
        System.out.println("4. Выход");
    }
}
