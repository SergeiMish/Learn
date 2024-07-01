import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

        void addNewNumberStepsPerDay() {
            System.out.println("Введите номер месяца");
            int mount = scanner.nextInt();
            if (mount < 1 || mount > 12){
                System.out.println("Месяц должен быть от 1 до 12. Вы ввели " + mount);
                return;
            }

            System.out.println("Введите день от 1 до 30 (включительно)");
            int day = scanner.nextInt();
            if (day < 1 || day > 30){
                System.out.println("Деньи должен быть от 1 до 30. Вы ввели " + day);
                return;
            }

            System.out.println("Введите количество шагов");
            int steps = scanner.nextInt();
            if (steps < 0){
                System.out.println("Количество шагов не может быть отрицательным. Вы ввели" + steps);
                return;
            }

            MonthData monthData = monthToData [mount - 1];

            monthData.days[day - 1] = steps;
        }
        void changeStepGoal(){
            System.out.println("Введите цель шагов на сегодня");
        int goalByStepsPerDay = scanner.nextInt();
        if (goalByStepsPerDay <= 0){
            System.out.println("Цель по количеству шагов не может быть отрицательной. Вы ввели " + goalByStepsPerDay);
            this.goalByStepsPerDay = goalByStepsPerDay;
        }
        }
}
