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
                }
                if (cmd == 2) {
                    stepTracker.changeStepGoal();
                }
                if (cmd == 3) {
                    stepTracker.printStatistic();
                }

        }
    }

    static void printMenu() {
        System.out.println("������� ����������� �������");
        System.out.println("1. ������ ���������� ����� �� ����������� ����");
        System.out.println("2. �������� ���� �� ���������� ����� � ����");
        System.out.println("3. ���������� ���������� �� ����������� �����");
        System.out.println("4. �����");

    }

}
