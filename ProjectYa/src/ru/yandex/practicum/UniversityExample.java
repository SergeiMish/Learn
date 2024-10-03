package ru.yandex.practicum;
import java.util.function.BiFunction;

public class ArithmeticOperationExample {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> plusOperation = getOperation("+");
        BiFunction<Integer, Integer, Integer> divideOperation = getOperation("/");
        BiFunction<Integer, Integer, Integer> minOperation = getOperation("min");
        BiFunction<Integer, Integer, Integer> maxOperation = getOperation("max");

        System.out.println(plusOperation.apply(5, 11));
        System.out.println(divideOperation.apply(12, 3));
        System.out.println(minOperation.apply(15, 7));
        System.out.println(maxOperation.apply(15, 7));
    }

    private static BiFunction<Integer, Integer, Integer> getOperation(String sign) {
        return switch (sign) {
            case "+" -> Integer::sum;
            case "-" -> (value1, value2) -> value1 - value2;
            case "*" -> (value1, value2) -> value1 * value2;
            case "/" -> (value1, value2) -> value1 / value2;
            case "max" -> Math::max;
            case "min" -> Math::min;
            //вставьте код здесь
            default -> throw new IllegalArgumentException("Неизвестная операция");
        };

    }
}