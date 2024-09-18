package ru.yandex.practicum;

public class FindRepeats {
    public boolean isPalindromeWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        String pal = sb.reverse().toString();
        if (str.equals(pal)) {
            return true;
        } return false;
    }
}