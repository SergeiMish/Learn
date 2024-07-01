import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }

        void addNewNumberStepsPerDay(){
            System.out.println("Введите номер месяца");
            int mount = scanner.nextInt();
            if (mount < 1 || mount > 12){
                System.out.println("Месяц должен быть от 1 до 12. Вы ввели " + mount);
                return;
            }
            // ввод и проверка номера месяца

            System.out.println("Введите день от 1 до 30 (включительно)");
            int day = scanner.nextInt();
            // ввод и проверка дня

            System.out.println("Введите количество шагов");
            // ввод и проверка количества шагов

            // получение соответствующего объекта MonthData из массива
            MonthData monthData = ...
            // сохранение полученных данных
            monthData.days[...] = ...
        }
    }
}
