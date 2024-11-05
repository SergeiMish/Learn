package ru.yandex.practicum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@interface ObjectInfo {
    Class<?> type() default Object.class;

    Class<?>[] args() default {};

    boolean required() default false;
}

// Класс для аннотирования
@ObjectInfo(type = MyClass.class)
public class MyClass {

    // Элементы класса
    @ObjectInfo(type = String.class)
    private String myField;

    // Конструктор
    @ObjectInfo(type = MyClass.class, args = {int.class}, required = true)
    public MyClass(int initialValue) {
        // Код конструктора
    }

    // Метод
    @ObjectInfo(type = void.class, args = {int.class, String.class}, required = true)
    public void myMethod(int number, String text) {
        // Код метода
    }



    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface CustomAnnotation {
    }
}