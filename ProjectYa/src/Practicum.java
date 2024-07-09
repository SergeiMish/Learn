import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��� ������������:");
        String name = scanner.nextLine();
        PersonAccount user = new PersonAccount(name);

        System.out.println("������ ������� ���� � RUB?");
        System.out.println("1 - ��");
        System.out.println("2 - ���");
        int command = scanner.nextInt();
        if (command == 1) {
            user.moneyRUB = 0.0;
        }

        System.out.println("������ ������� ���� � USD?");
        System.out.println("1 - ��");
        System.out.println("2 - ���");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyUSD = 0.0;
        }

        System.out.println("������ ������� ���� � EUR?");
        System.out.println("1 - ��");
        System.out.println("2 - ���");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyEUR = 0.0;
        }

        System.out.println("�����������, ������� ��� ������������ " + user.name + " ������.");
        System.out.println("�������� �����:");
        if (user.moneyRUB == 0.0) {
            System.out.println("- RUB");
        }
        if (user.moneyUSD == 0.0) {
            System.out.println("- USD");
        }
        if (user.moneyEUR == 0.0) {
            System.out.println("- EUR");
        }

    }
}

class PersonAccount {
    String name;      // ��� � �������
    Double moneyRUB;  // ���� � ������
    Double moneyUSD;  // ���� � ��������
    Double moneyEUR;  // ���� � ����


    PersonAccount(String userName) {
        name = userName;
    }
}