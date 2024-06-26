import java.util.Scanner;

public class ExpensesManager {
    double[] expenses;
    Scanner scanner = new Scanner(System.in);
    public ExpensesManager(){
        double[] expenses = new double[7];
    }
          void saveExpense(double moneyBeforeSalary, double expense, int day) {
        // ������ �������� � ���������� ������� �������� � ������ Practicum
        System.out.println("�� ����� ���� �� ������ ������ �����: 1-��, 2-��, 3-��, 4-��, 5-��, 6-��, 7-��?");
        int day = scanner.nextInt();
        System.out.println("������� ������ �����:");
        double expense = scanner.nextDouble();

        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses[day - 1] = expenses[day - 1] + expense;
        System.out.println("�������� ���������! ��� ������� ������ � ������: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("�� ����� ����� �������� ������ �������. ����� ������ ���������!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("���� " + (i + 1) + ". ��������� " + expenses[i] + " ������");
        }
    }

    public double findMaxExpense() {
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        return maxExpense;
    }
    }