package ru.yandex.practicum;

    public abstract class ValidationRule<T> {
    protected final ... value;
    private final String errorMessage;

    protected ValidationRule(... value, String errorMessage) {
        this.value = value;
        this.errorMessage = errorMessage;
    }

    public abstract boolean isValid();

    public String getErrorMessage() {
        return errorMessage;
    }
}