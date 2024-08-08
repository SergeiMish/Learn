package ru.yandex.practicum;

public class Smartphone extends Phone {

    ...
            // объявите метод sendEmail()
            ... {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    public Smartphone(String number) {
        super(number);
    }
}