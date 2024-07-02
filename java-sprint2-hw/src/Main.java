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
                System.out.println("�� ��������� ���������! �������� ���!");
                break;
            } else {
                System.out.println("�� ����� �������� �������. ���������� ������� ����� �� 1 �� 4. �� ����� " + cmd);
                System.out.println();
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
