import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StepTracker stepTracker = new StepTracker(scanner);
        MonthData monthData = new MonthData();
        stepTracker.addNewNumberStepsPerDay();
        stepTracker.changeStepGoal();
        monthData.printDaysAndStepsFromMonth();

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
