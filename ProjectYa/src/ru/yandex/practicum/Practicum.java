package ru.yandex.practicum;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practicum {
    private static Map<String, String> films = new LinkedHashMap<>();

    public static void main(String[] args) {
        films.put("Титаник", "Джеймс Кэмерон");
        films.put("Гарри Поттер и философский камень", "Крис Коламбус");
        films.put("Хакеры", "Иэн Софтли");
        films.put("Терминатор", "Джеймс Кэмерон");

        for (String film : films.keySet()) {
            System.out.println(film);
        }
    }
}
        // Выведите собранную статистику в консоль и посчитайте общее количество заказов.
        //
        // Формат для вывода данных в консоль:
        //     Заказов от Микеланджело: 15
        //     Заказов от Леонардо: 4
        //     Всего заказов: 19