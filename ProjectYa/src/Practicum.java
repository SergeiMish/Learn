public class Practicum {
    public static void main(String[] args) {
        WeatherCalendar calendar = new WeatherCalendar("�������", 31);

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
        if (calendar.rainyDays > 15) {
            calendar.isRainyMonth = true;
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

class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays = 0;
    int year = 2020;
    boolean isRainyMonth;
    public WeatherCalendar(String monthName, int monthNumberOfDays) {

    }

    // ��������� ���������� rainyDays �� �������
    public void addRainyDay() {
        rainyDays = rainyDays + 1;
    }
}
