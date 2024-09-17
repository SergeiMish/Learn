package ru.yandex.practicum;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int repeat = 0;
        int index = 0;

        while ((index = text.indexOf(substring, index)) != -1) {
            repeat++;
            index += substring.length();
        }

        return repeat;
    }
}