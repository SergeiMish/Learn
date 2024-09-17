package ru.yandex.practicum;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int repeat = 0;
            while (text.contains(substring)){
                if (text.equals(substring)){
                    repeat++;
                    text = null;
                }
                int index = text.indexOf(substring) + substring.length();
                return repeat + index;
            } return repeat;
        }
    }