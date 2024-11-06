package ru.yandex.practicum;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.Arrays;


@Retention(RetentionPolicy.RUNTIME) // указывает, что аннотация будет доступна во время выполнения программы
@Target(ElementType.TYPE)  // указывает,что аннотация будет использоваться для пометки методов, подлежащих проверке
        @interface CorrectImplementation {
        // ожидаемый возвращаемый тип метода
        Class<?> expectedReturnType() default void.class;

// ожидаемые типы параметров метода
         Annotation [] expectedParameterTypes = AnnotationValidator.class.getAnnotations();
          }

class AnnotationValidator {

    // метод для валидации
    public static void validateMethods(Object instance) {
        // получаем класс объекта
        Class<?> clazz = instance.getClass();

        // итерируем по методам класса
        for (Method method : clazz.getMethods()) {
            // проверяем наличие аннотации
            if (method.isAnnotationPresent(Annotation.class)) {
                // получаем аннотацию
        Annotation annotation = method.getAnnotation(Annotation.class);

                // получаем ожидаемый возвращаемый тип и типы параметров из аннотации
        ... expectedReturnType = annotation....();
        ...[] expectedParameterTypes = annotation....();

                // проверяем, соответствует ли фактический возвращаемый тип ожидаемому
                if (!method.getReturnType().equals(expectedReturnType)) {
                    // выводим сообщение об ошибке
                    System.out.println(
                            "Ошибка: Метод " + method.getName()
                                    + " имеет неправильный тип возвращаемого значения (" + method.getReturnType() + ")." +
                                    " Ожидаемый: " + expectedReturnType.getSimpleName());
                    // ничего не возвращаем, так как мы не ожидаем результата валидации
                    return;
                }

                // получаем фактические типы параметров
                Class<?>[] actualParameterTypes = method....();

                // проверяем, соответствуют ли фактические типы параметров ожидаемым
                if (!Arrays.equals(expectedParameterTypes, actualParameterTypes)) {
                    // выводим сообщение об ошибке
                    System.out.println(
                            "Ошибка: Метод "
                                    + method.getName()
                                    + " имеет неправильные типы параметров. Ожидаемые:"
                                    + Arrays.toString(expectedParameterTypes));
                    // ничего не возвращаем, так как мы не ожидаем результата валидации
                    return;
                }
            }
        }

        // выводим сообщение об успешной валидации
        System.out.println("Все методы реализованы корректно.");
        // ничего не возвращаем, так как мы не ожидаем результата валидации
    }
}

public class MathOperations {
    // метод для сложения
    @...(
            ... = int...,
            ... = {int.class, ...})
    public int add(int a, int b) {
        return a + b;
    }

    // метод для деления
  ...(
          ... = ...,
          ... = {..., ...})
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Невозможно разделить на ноль");
        }
        return a / b;
    }

    // метод для умножения
  ...(
          ... = ...,
          .... = {..., ...})
    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        // вызываем метод валидации аннотаций
        AnnotationValidator.validateMethods(...);
    }
}