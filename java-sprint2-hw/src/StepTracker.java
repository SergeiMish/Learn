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
            System.out.println("������� ����� ������");
            int mount = scanner.nextInt();
            if (mount < 1 || mount > 12){
                System.out.println("����� ������ ���� �� 1 �� 12. �� ����� " + mount);
                return;
            }

            System.out.println("������� ���� �� 1 �� 30 (������������)");
            int day = scanner.nextInt();
            if (day < 1 || day > 30){
                System.out.println("����� ������ ���� �� 1 �� 30. �� ����� " + day);
                return;
            }

            System.out.println("������� ���������� �����");
            int steps = scanner.nextInt();
            if (steps < 0){
                System.out.println("���������� ����� �� ����� ���� �������������. �� �����" + steps);
                return;
            }

            MonthData monthData = monthToData [mount - 1];

            monthData.days[day - 1] = steps;
        }
        void changeStepGoal(){
            System.out.println("������� ���� ����� �� �������");
        int goalByStepsPerDay = scanner.nextInt();
        if (goalByStepsPerDay <= 0){
            System.out.println("���� �� ���������� ����� �� ����� ���� �������������. �� ����� " + goalByStepsPerDay);
            this.goalByStepsPerDay = goalByStepsPerDay;
        }
    }
    void printStatistic() {
        System.out.println("������� ����� ������");
        int mount = scanner.nextInt();
        if (mount < 1 || mount > 12){
            System.out.println("����� ������ ���� �� 1 �� 12. �� ����� " + mount);
            return;
        }

        MonthData monthData = monthToData [mount - 1]; // ��������� ���������������� ������
        int sumSteps = monthData.sumStepsFromMonth(); // ��������� ����� ����� �� �����
        monthData.printDaysAndStepsFromMonth();// ����� ����� ���������� �� ����
        System.out.println("����� ����� �� ����� " + sumSteps);    // ����� ����� ����� �� �����
        System.out.println("���������� ����������� ��������� ����� �� ����� � ������� ������ ��� " + monthData.maxSteps());    // ����� ������������� ����������� ���������� ����� �� �����
        System.out.println("������� ���������� ����� �� ����� " + sumSteps/30);    // ����� �������� ����������� ���������� ����� �� �����
        System.out.println("���������� ���������� �� ����� " + converter.convertToKm(sumSteps) + " ��");     // ����� ���������� �� ����� ��������� � ����������
        System.out.println("���������� �������� ����������� �� ����� " + converter.convertStepsToKilocalories(sumSteps));    // ����� ���������� �������� ����������� �� �����
        System.out.println("������ ����� " + monthData.bestSeries(goalByStepsPerDay));     // ����� ������ �����
        System.out.println(); // �������������� ������� ������
    }
}
