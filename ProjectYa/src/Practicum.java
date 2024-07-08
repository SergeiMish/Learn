public class Practicum {
    public static void main(String[] args) {
        WeatherCalendar calendar = new WeatherCalendar("����");
        calendar.month = "�������";
        calendar.numberOfDays = 31;


        String[] octoberWeather = new String[]{
                "��������",
                "�����",
                "��������",
                "�����",
                "�����",
                "�������",
                "��������",
                "�����",
                "��������",
                "��������",
                "��������",
                "�������",
                "��������",
                "�����",
                "��������",
                "��������",
                "��������",
                "�������",
                "�������",
                "�������",
                "�������",
                "�����",
                "�����",
                "�������",
                "��������",
                "�����",
                "��������",
                "�����",
                "��������",
                "��������",
                "��������",
                "��������",
                "�������"
        };

        for (int i = 0; i < calendar.numberOfDays; i++) {
            if (octoberWeather[i].equals("�����")) {
                calendar.addRainyDay();
            }
        }

        // ���������, ��� �� ����� ���������. ���� �� � ���������� �������� isRainyMonth
        if (octoberWeather.equals("�����")) {
            boolean isRainyMonth = true;
        }

        System.out.println(calendar.month + " " + calendar.year + " ����. "
                + calendar.rainyDays + " ���� ��� �����.");

        // ��������� �������� isRainyMonth
        if (calendar.isRainyMonth) {
            System.out.println("��� ��� ��������� �����.");
        } else {
            System.out.println("���� ����� ��� �������� �����.");
        }
    }
}

class WeatherCalendar(String monthName, int monthNumberOfDays) {
    String month;
    int numberOfDays;
    int rainyDays = 0;
    int year = 2024;
    boolean isRainyMonth;

    // ��������� ���������� rainyDays �� �������
    public void addRainyDay() {
        ...
    }
}
}
