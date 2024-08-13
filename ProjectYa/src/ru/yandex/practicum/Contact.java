package ru.yandex.practicum;

// Дополните класс для проверки трудоустроенности пользователя
public abstract class Contact {
    // Класс должен содержать одно полe - имя пользователя name
    private final String name;

    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
    public abstract void sendMessage();

    public Contact(String name) {
        this.name = name;
    }

    public abstract void print();

    public String getName() {
        return name;
    }
}