package ru.yandex.practicum;

public class Task {

    static String priority; // добавьте переменную priority с приоритетом задачи

    private String description;
    public Task(String description) {
        this.description = description;
    }
    // добавьте конструктор класса

    public static String getPriority() {
        if (priority.equals(TaskPriority.HIGH)){
            System.out.println("ываыа");
        }

        return priority;
    }

    // добавьте метод get для приоритета

    public String getDescription() {
        return description;
    }
}