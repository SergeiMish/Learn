package ru.yandex.practicum;

public class FindRepeats {
    public boolean isPalindromeLine(String str) {

        String str2 = str.replaceAll("\\s+", "").toLowerCase();
        StringBuilder sb = new StringBuilder(str2);
        String str3 = sb.reverse().toString();
        if (str2.equals(str3)) {
            System.out.println(true);
            return true;
        }
        return false;
    }
}