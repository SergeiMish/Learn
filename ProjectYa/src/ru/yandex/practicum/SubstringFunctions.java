package ru.yandex.practicum;

public class SubstringFunctions {
    public boolean startsWith(String initial, String other) {
        if (initial == null || other == null) {
            return false;
        }
        return initial.indexOf(other) == 0;
    }
}