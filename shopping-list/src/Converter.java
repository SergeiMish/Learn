public class Converter {
    double rateUSD = 94.8;
    double rateEUR = 103.8;
    double rateCNY = 13.1;

    public void convert(double rubles, int currency) {
        if (currency == 1) {
            System.out.println("���� ���������� � ��������: " + rubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("���� ���������� � ����: " + rubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("���� ���������� � �����: " + rubles / rateCNY);
        } else {
            System.out.println("������� ����������� ������.");
        }
    }
}
