package ru.yandex.practicum;

public class LimitException extends RuntimeException {
    public LimitException (final String message, final int attempts){
        super(message);
    }
}