package ru.yandex.practicum;

public class main {
    public static void main(String[] args) {
    String grades = "вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5";
    Grades gd = new Grades();
    gd.gradeBeautifier(grades);
    }
}