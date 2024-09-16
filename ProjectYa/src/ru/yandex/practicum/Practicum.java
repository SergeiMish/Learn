package ru.yandex.practicum;

public class Practicum {
    public String fixString(String str) {
        if (str == null || str.trim().isBlank()) {
            System.out.println("Вы ничего не ввели!");
            return "";
        } else {
            return str;
        }
}