package ru.yandex.practicum;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


class Practicum {
    public static void main(String[] args) {
        // время начала работы над задачей — 9:00
        LocalTime taskStart = LocalTime.of(...);
        // время окончания работы над задачей — 11:30
        LocalTime taskFinish = LocalTime.of(...);

        // опишите формат вывода в виде часы:минуты
        DateTimeFormatter formatter = ...

        // найдите продолжительность между двумя единицами времени
        Duration duration = ...

        // taskStart должен быть выведен в указанном формате
        System.out.println("В прошлый раз задача была начата в " + ... + ",");
        // taskFinish должен быть выведен в указанном формате
        System.out.println("а закончена в " + ... + ".");

        LocalTime now = LocalTime.now();
        // now должен быть выведен в указанном формате
        System.out.println("Сейчас " + ... + ".");

        // прибавьте к текущему моменту вычисленную продолжительность
        LocalTime finishTime = ...;

        // finishTime должен быть выведен в указанном формате
        System.out.println("Значит, задача будет выполнена к " + ... + ".");
    }
}