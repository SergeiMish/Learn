package ru.yandex.practicum;

public class Practicum {
    private boolean isCapsLock = false;

    public void capsLock() {
        isCapsLock = !isCapsLock;
        // Здесь нужно изменить значение флага isCapsLock на противоположное
    }

    public void print(String str) {
        if (isCapsLock){
            System.out.println(str.toUpperCase());
        }
        else {
            System.out.println(str);
        }
        // а здесь нужно распечатать строку или в верхнем регистре, или без изменений, учитывая флаг
    }
}