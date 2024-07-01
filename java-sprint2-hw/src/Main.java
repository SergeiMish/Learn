import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StepTracker stepTracker = new StepTracker(scanner);
        stepTracker.addNewNumberStepsPerDay();
        stepTracker.changeStepGoal();

    //        while (true) {
//            printMenu();
//
//            int i = scanner.nextInt();
//            // обработка выбранной команды
//        }
//    }
//
//    static void printMenu() {
        // вывод доступных команд
    }

}
