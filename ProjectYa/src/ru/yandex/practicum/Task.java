package ru.yandex.practicum;

public class Task {

    ... // добавьте переменную priority с приоритетом задачи

    public Task(String description) {
        this.description = description;
    }

    private String description;

    ...// добавьте конструктор класса

            ... // добавьте метод get для приоритета

    public String getDescription() {
        return description;
    }
}