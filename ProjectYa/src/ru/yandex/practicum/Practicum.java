package ru.yandex.practicum;

public class Practicum {
    public static void main(String[] args) {
        String rules = "На зелёный цвет — стой на месте;\n" +
                "на зелёный цвет — приготовься;\n" +
                "на зелёный — осмотрись, а затем смело шагай.";

        String replaced = rules;
        System.out.println(replaced.replaceFirst("зелёный", "красный").replaceFirst("зелёный", "желный")
                .replace("цвет", "свет"));
    }
}