package ru.yandex.practicum;

public class MobilePhone extends Phone {



    //объявите метод sendSms()
    public void sendSms(String messageText, int targetNumber) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }

    public MobilePhone(String number) {
        super(number);
    }
}