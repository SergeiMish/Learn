package ru.yandex.practicum;

import java.util.List;

public class Calculator {

    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        int totalMinutes = 0;

        for (MediaItem item : mediaItems) {
            totalMinutes += item.getRuntime();
        }

        // Переводим минуты в дни (1 день = 24 часа * 60 минут)
        double totalDays = (double) totalMinutes / (24 * 60);

        return totalDays;
    }
}
