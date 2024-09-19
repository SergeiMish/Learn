package ru.yandex.practicum;

public class main {
    public static void main(String[] args) {
        String[] grades = {
                "Вероника Чехова физика — Безупречно",
                "Анна Строкова математика — Потрясающе",
                "Иван Петров геометрия — Безупречно"
        };
        GradesReversed gradesReversed = new GradesReversed();
        gradesReversed.serializeGrades(grades);
    }

}