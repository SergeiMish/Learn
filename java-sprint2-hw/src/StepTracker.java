import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("¬ведите номер мес€ца");
        int mount = scanner.nextInt();
        if (mount < 1 || mount > 12) {
            System.out.println("ћес€ц должен быть от 1 до 12. ¬ы ввели " + mount);
            return;
        }

        System.out.println("¬ведите день от 1 до 30 (включительно)");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("ƒеньи должен быть от 1 до 30. ¬ы ввели " + day);
            return;
        }

        System.out.println("¬ведите количество шагов");
        int steps = scanner.nextInt();
        if (steps < 0) {
            System.out.println(" оличество шагов не может быть отрицательным. ¬ы ввели" + steps);
            return;
        }
        MonthData monthData = monthToData[mount - 1];

        monthData.days[day - 1] = steps;
    }

    void changeStepGoal() {
        System.out.println("¬ведите цель шагов на сегодн€");
        int goalByStepsPerDay = scanner.nextInt();
        if (goalByStepsPerDay <= 0) {
            System.out.println("÷ель по количеству шагов не может быть отрицательной. ¬ы ввели " + goalByStepsPerDay);
            return;
        }
        this.goalByStepsPerDay = goalByStepsPerDay;
    }

    void printStatistic() {
        System.out.println("¬ведите номер мес€ца");
        int mount = scanner.nextInt();
        if (mount < 1 || mount > 12) {
            System.out.println("ћес€ц должен быть от 1 до 12. ¬ы ввели " + mount);
            return;
        }

        MonthData monthData = monthToData[mount - 1]; // получение соответствующего мес€ца
        int sumSteps = monthData.sumStepsFromMonth(); // получение суммы шагов за мес€ц
        System.out.println("—татистика за мес€ц:");
        monthData.printDaysAndStepsFromMonth();// вывод общей статистики по дн€м
        System.out.println("--".repeat(20));
        System.out.println("—умма шагов за мес€ц: " + sumSteps);    // вывод суммы шагов за мес€ц
        System.out.println(" оличество максимально пройденых шагов за мес€ц в течении одного дн€: " + monthData.maxSteps());    // вывод максимального пройденного количества шагов за мес€ц
        System.out.println("—реднее количество шагов за мес€ц: " + sumSteps / 30);    // вывод среднего пройденного количества шагов за мес€ц
        System.out.println("–ассто€ние пройденное за мес€ц: " + converter.convertToKm(sumSteps) + " км");     // вывод пройденной за мес€ц дистанции в километрах
        System.out.println(" оличество сожженых килокалорий за мес€ц: " + converter.convertStepsToKilocalories(sumSteps));    // вывод количества сожжЄнных килокалорий за мес€ц
        System.out.println("Ћучша€ сери€: " + monthData.bestSeries(goalByStepsPerDay));     // вывод лучшей серии
        System.out.println(); // дополнительный перенос строки
    }
}
