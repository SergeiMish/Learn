
public class Practicum {
    public static void main(String[] args) {
        String pixelKcalDay = "43"; // ������� ������� ���� ������� �� ������ � �������
        String beefKcal = "30.2"; // ������������ ��������
        String chickenKcal = "23.8"; // ������������ ������
        String creamKcal = "32.1"; // ������������ ������
        String milkKcal = "13.5"; // ������������ ������

        float pixelChoice = getMinKcalsSum(beefKcal, chickenKcal, creamKcal, milkKcal);
        float totalKcal = Integer.parseInt(pixelKcalDay) + pixelChoice;
        checkKcal(totalKcal);
    }

    private static Float getMinKcalsSum(String firstDishKcal, String secondDishKcal, String firstDesert, String secondDesert) {
        float minDishKcal = ... // ��������� ����������� ������������ ��������� �����
        float minDesertKcal = ... // ��������� ����������� ������������ �������
        return minDishKcal + minDesertKcal;
    }

    private static void checkKcal(float catKcal) {
        if (catKcal == null) {
            System.out.println("���-�� ����� �� ���");
        } else {
            System.out.println("������������ ������� ������� �� ����: " + catKcal);
            if (catKcal > 100) {
                System.out.println("������� ������� �� �������� � �����.");
            } else {
                System.out.println("����� �� ��������!");
            }
        }
    }
}