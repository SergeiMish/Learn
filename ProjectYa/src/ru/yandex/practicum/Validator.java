package ru.yandex.practicum;

public interface Validator {
    void validate(String value) throws ValidateException;
}