public class Practicum {
    public static void main(String[] args) {
        WeatherCalendar calendar = new WeatherCalendar("Октя");
        calendar.month = "Октябрь";
        calendar.numberOfDays = 31;


        String[] octoberWeather = new String[]{
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Дождь",
                "Дождь",
                "Облачно",
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Солнечно",
                "Солнечно",
                "Облачно",
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Солнечно",
                "Солнечно",
                "Облачно",
                "Облачно",
                "Облачно",
                "Облачно",
                "Дождь",
                "Дождь",
                "Облачно",
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Дождь",
                "Солнечно",
                "Солнечно",
                "Солнечно",
                "Солнечно",
                "Облачно"
        };

        for (int i = 0; i < calendar.numberOfDays; i++) {
            if (octoberWeather[i].equals("Дождь")) {
                calendar.addRainyDay();
            }
        }

        // проверить, был ли месяц дождливым. Если да — установить значение isRainyMonth
        if (octoberWeather.equals("Дождь")) {
            boolean isRainyMonth = true;
        }

        System.out.println(calendar.month + " " + calendar.year + " года. "
                + calendar.rainyDays + " дней шёл дождь.");

        // проверить значение isRainyMonth
        if (calendar.isRainyMonth) {
            System.out.println("Это был дождливый месяц.");
        } else {
            System.out.println("Этот месяц был довольно сухим.");
        }
    }
}

class WeatherCalendar(String monthName, int monthNumberOfDays) {
    String month;
    int numberOfDays;
    int rainyDays = 0;
    int year = 2024;
    boolean isRainyMonth;

    // увеличить переменную rainyDays на единицу
    public void addRainyDay() {
        ...
    }
}
}
