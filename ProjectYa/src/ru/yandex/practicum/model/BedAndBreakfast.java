package ru.yandex.practicum.model;

public class BedAndBreakfast { // сделайте класс общедоступным

    ... // число свободных номеров (10) сохраните в переменную capacity

            ... // сохраните в переменную full значение false - есть номера в наличии

    void book() { // метод для бронирования комнат
        if (...) { // если есть свободные номера
            System.out.println("Забронирован ещё один номер!");
            ... // уменьшите количество свободных номеров на один
            printRooms();
            if (capacity == 0) {
                full = true;
            }
        } else {
            System.out.println("Свободных номеров нет!");
        }
    }

    void printRooms() {
        System.out.println("Свободных номеров - " + ...);
    }

    void free() { // метод для освобождения комнат
        if (...) { // если свободных комнат меньше 10
            ... // увеличиваем количество свободных мест на одно
            System.out.println("Освободился номер!");
            printRooms();
            full = false;
        } else {
            System.out.println("В гостинице только 10 номеров.");
        }
    }

    boolean isFull() {
        return full;
    }
}