package ru.yandex.practicum;

import java.util.List;

public class Calculator {

    private Calculator() {}

    public static int calculate(List<MediaItem> mediaItems) {
        int totalMinutes = 0;

        for (MediaItem item : mediaItems) {
            totalMinutes += item.getRuntime();
        }

        // Переводим минуты в дни (1 день = 24 часа * 60 минут)

        return totalMinutes / (24 * 60);
    }

}