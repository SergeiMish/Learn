package ru.yandex.practicum;

public class Task {

    private String priority; // добавьте переменную priority с приоритетом задачи
    private String description;
    public Task(TaskPriority priority, String description) {
        this.description = description;
    }
    // добавьте конструктор класса

    // добавьте метод get для приоритета

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }
}