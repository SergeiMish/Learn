package ru.yandex.practicum;

public class Practicum {
    public static void main(String[] args) {
        FindRepeats check = new FindRepeats();
        int count = check.numberOfRepeats("раз, раз, раз", "раз");
        int count2 = check.numberOfRepeats("Hello, world!", "goodbye"); // вернёт 0)
        int count3 = check.numberOfRepeats("раз два три, раз два три", "раз"); // 2
        System.out.println(count);
        System.out.println(count2);
        System.out.println(count3);
    }
}