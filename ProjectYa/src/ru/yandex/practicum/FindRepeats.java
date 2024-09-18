package ru.yandex.practicum;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        StringBuilder sb = new StringBuilder(text);
        int count = 0;
        while (sb.indexOf(substring) != (-1)) {
            count++;
            sb.delete(0, count +2);
        }
        return count;
    }
}