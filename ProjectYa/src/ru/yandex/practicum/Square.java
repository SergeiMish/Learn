package ru.yandex.practicum;

public class Square extends Rectangle{
    // Длина стороны квадрата
    private final double a;

    public Square(double a) {
        super(a, a);
        this.a = a;
    }

    public double getArea() {
        return a * a;
    }
}