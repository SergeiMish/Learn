import java.util.ArrayList;

public class Practicum {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("��������");
        animals.add("��������");
        animals.add("���");
        animals.add("�������");
        animals.add("����");
        System.out.println("������� � �������� ����� ������� ��������� " + animals.size() + " ��������.");
        System.out.println("��� �����:");

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
            System.out.println("���������� ���������:");

        System.out.println("� 9:00 - " + animals.get(1));
        System.out.println("� 10:00 - " + animals.get(4));     //
        System.out.println("� 11:00 - " + animals.get(0));  //
        System.out.println("� 12:00 - " + animals.get(2));    //
        System.out.println("� 13:00 - " + animals.get(3));     // );

            }
        }



        // "��� �����:"
        // "��������"
        // "��������"
        // "���"
        // "�������"
        // "����"
        // "���������� ���������:"
        // "� 9:00 - "
        // "� 10:00 - "
        // "� 11:00 - "
        // "� 12:00 - "
        // "� 13:00 - "
//        }
//    }