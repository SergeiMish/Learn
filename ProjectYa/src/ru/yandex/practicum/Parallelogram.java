package ru.yandex.practicum;

public abstract class Parallelogram implements Figure{
    public abstract double getArea();
    private double width;
    private double height;

    public Parallelogram(double width, double height) {
        this.width = width;
        this.height = height;
    }
}