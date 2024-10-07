package ru.yandex.practicum;

import java.util.stream.Stream;

public class OptionalInStreams {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .filter(number -> number % 2 == 0)
                .//выбрать первый отфильтрованный элемент
                .//вывести на экран найденное число либо строку "Чётное число не найдено"
    }
}