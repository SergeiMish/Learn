package ru.yandex.practicum;

public class Smartphone extends MobilePhone {

    public void makeCall(String targetNumber, String appName){
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
    }
            // объявите метод sendEmail()
            public void sendEmail (String messageText, String email){
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    public Smartphone(String number) {
        super(number);
    }
}