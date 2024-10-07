package ru.yandex.practicum;

import java.time.LocalDate;
import java.time.LocalTime;


class Practicum {
    public static void main(String[] args) {
        LocalDate secretDate = LocalDate.of(2020, 1, 10);
        LocalTime secretTime = LocalTime.of(12, 30);

        int result = decode(secretDate, secretTime);
        System.out.println(result);
    }

    private static int decode(LocalDate secretDate, LocalTime secretTime) {
        // объедините secretDate и secretTime
        ... newTime = ...

        // вычтите 2 месяца, 25 дней и 100 минут
        ... secretMoment = ...
        // найдите произведение порядкового номера дня в году и часов из secretMoment
        return ... * ...;
    }
}