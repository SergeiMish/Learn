package ru.yandex.practicum;

import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Practicum {

    private static final Logger log = LoggerFactory.getLogger(Practicum.class);

    public static final LocalTime CHECK_IN_TIME = LocalTime.of(14, 0);

    public static void main(String[] args) {
        LocalTime start = LocalTime.of(14, 0);
        LocalTime finish = LocalTime.of(12, 0);

        log.info("Пользователь выбрал интервал заселения {}-{}.", start, finish);

        try {
            confirmCheckInTime(start, finish);
        } catch (IllegalArgumentException e) {
            log.error("Выбран неправильный интервал.", e);
        }
    }

    public static void confirmCheckInTime(LocalTime start, LocalTime finish) {
        if (start.isAfter(finish)) {
            throw new IllegalArgumentException("Начало интервала должно быть раньше завершения интервала.");
        }

        if (CHECK_IN_TIME.isBefore(start) || CHECK_IN_TIME.equals(start)) {
            System.out.println("Время заселения подтверждено.");
        } else {
            System.out.println("Заселение возможно после " + CHECK_IN_TIME + ".");
        }
    }
}