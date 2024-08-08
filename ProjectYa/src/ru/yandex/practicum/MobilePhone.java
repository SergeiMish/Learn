package ru.yandex.practicum;

public class MobilePhone extends Phone {

    public MobilePhone(String ) {
    }

    //объявите метод sendSms()
            public void sendSms() {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }

    public MobilePhone(String number) {
        super(number);
    }
}