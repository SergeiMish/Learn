public class Practicum {
    public static void main(String[] args) {
        WeatherCalendar calendar;
        calendar.month = "�������";
        calendar.numberOfDays = 31;
        calendar.rainyDays = 0;
        calendar.isRainyMonth = false;

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
        if (...) {
            ...
        }

        System.out.println(calendar.month + " " + calendar.year + " ����. "
                + calendar.rainyDays + " ���� ��� �����.");

        // ��������� �������� isRainyMonth
        if (...) {
            System.out.println("��� ��� ��������� �����.");
        } else {
            System.out.println("���� ����� ��� �������� �����.");
        }
    }
}

class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays;
    int year;
    boolean isRainyMonth;

    // ��������� ���������� rainyDays �� �������
    public void addRainyDay() {
        ...
    }
}
}
