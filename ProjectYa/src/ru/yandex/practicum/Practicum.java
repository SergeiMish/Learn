package ru.yandex.practicum;

import java.util.Optional;

public class Practicum {
    public static void main(String[] args) {
        // Доработайте данный метод, чтобы на экран выводилось
        // сообщение в соответствии с заданием

        SearchService searchService = new SearchService();
        Optional<Candy> result = searchService.search("Африка");

        result.ifPresentOrElse(
                candy -> System.out.println("Товар \"" + candy.name + "\" доступен в количестве " + candy.amount + " кг по цене " + candy.price + " руб за кг"),
                () -> System.out.println("Данный товар не найден.")
        );
    }

}