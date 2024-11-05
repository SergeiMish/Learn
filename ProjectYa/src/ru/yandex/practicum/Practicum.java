package ru.yandex.practicum;

@interface ObjectInfo {
        Class<?> type() ... Object....;
        Class<?>[] args() default  {};
        ... ... ... ...;
        }

// Класс для аннотирования
        ......(... = ....class)
public class MyClass {

    // Элементы класса
    ....(type = String. ...)
    private String myField;

    // Конструктор
    @....(type = ..., args = {...}, ... = true)
    public MyClass(int initialValue) {
        // Код конструктора
    }

    // Метод
    ...(type = ...сlass, args = {int.class, ....}, ... = true)
    public void myMethod(int number, String text) {
        // Код метода
    }
}