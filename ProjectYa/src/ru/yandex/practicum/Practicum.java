package ru.yandex.practicum;

import java.util.HashMap;
import java.util.Map;

public class Practicum {
    // Создадим хеш-таблицу для хранения заказов.
    // В качестве ключа будет имя клиента.
    // В качестве значения — количество заказов от этого клиента.
    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Practicum pizzeria = new Practicum();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    // Начинаем принимать заказы! 🍕
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {
        if (orders.containsKey(clientName)) {
            orders.put(clientName, orders.get(clientName) + 1);
        } else {
            orders.put(clientName, 1);
        }
    }

    private void printStatistics() {
        int sum = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : orders.entrySet()) {
            System.out.println("Заказов от " + stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
            sum = stringIntegerEntry.getValue() + sum;
        }
        System.out.println("Всего заказов: " + sum);
    }
}

        // Выведите собранную статистику в консоль и посчитайте общее количество заказов.
        //
        // Формат для вывода данных в консоль:
        //     Заказов от Микеланджело: 15
        //     Заказов от Леонардо: 4
        //     Всего заказов: 19