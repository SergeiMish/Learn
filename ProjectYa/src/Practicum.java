import java.util.ArrayList;
import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> animals = new ArrayList<>();
        animals.add("1212");
        animals.add("��������");
        animals.add("���");
        animals.add("�������");
        animals.add("����");


        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("������ � �������� ����� ������� " + animals.size() + " ��������:");
                for (String i : animals){
                    System.out.println(i);; // ����������� ��������
                }
            } else if (command == 2) {
                System.out.println("����� �������� ������ ��������?");
                String animal = scanner.next();
                animals.add(animal);// �������� ��������
            } else if (command == 3) {
                System.out.println("����� �������� ����� �������?");
                String animal = scanner.next();
                if (!animals.isEmpty()){
                    animals.remove(animal);
                }// ������� ��������, ���� ������ �� ����
            } else if (command == 4) {
                animals.clear(); // �������� ������
                System.out.println("��� �������� ���������� � ������ �������. ������ ����.");
            } else if (command == 5) {
                System.out.println("����� �������� �� ������ ������� � ��������?");
                String animal = scanner.next();

                if (animals.contains(animal)) {
                    // �������� �������
                    System.out.println(animal + " �� �����! ��������� ����������.");
                }
                else {
                     System.out.println("������ ��������� ������ ��� � ����� ��������.");
                }
            } else {
                break;
            }
        }
    }
    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты");
        System.out.println("5 - Показать самую большую сумму расходов");
        System.out.println("0 - Выход");
    }
}