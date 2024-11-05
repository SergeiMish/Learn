package ru.yandex.practicum;

@interface ObjectInfo {
        Class<?> type() default Object.class;
        Class<?>[] args() default {};
        boolean required() default false;
        }

// Класс для аннотирования
        @ObjectInfo(type = int.class)
public class MyClass {

    // Элементы класса
    @ObjectInfo(type = String.class)
    private String myField;

    // Конструктор
    @ObjectInfo(type = int.class, args = {}, required = true)
    public MyClass(int initialValue) {
        // Код конструктора
    }

    // Метод
    ...(type = ...сlass, args = {int.class, ....}, ... = true)
    public void myMethod(int number, String text) {
        // Код метода
    }
}