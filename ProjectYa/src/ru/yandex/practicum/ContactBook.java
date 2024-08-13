package ru.yandex.practicum;

import java.util.ArrayList;

// Дополните класс для проверки суммы ипотеки пользователя
public class ContactBook<T extends Contact> {
    // Объявите поле класса contacts - список контактов книги
    ArrayList<T> contacts = new ArrayList<>();

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
        // Выведите на экран весь список контактов книги
        for (T contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
        }
    }

    public void congratulate(String name) {
        boolean contactPresented = false;
        for (T contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
                contact.sendMessage();
                contactPresented = true;
                break;
            }
        }
        if (!contactPresented) {
            System.out.println("Не найден контакт с указанным именем.");
        }
    }
}