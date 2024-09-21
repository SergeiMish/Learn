package ru.yandex.practicum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckPrinterImproved {

    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        items = new String[]{"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};
        List<String> names = new ArrayList<>();
        List<String> values = new ArrayList<>();
        List<String> costs = new ArrayList<>();
        for (String item : items) {
            String[] split = item.split(", ");
            String name = split[0];
            String value = split[1];
            String cost = split[2];
            names.add(name);
            values.add(value);
            costs.add(cost);
        }
        int maxNameLength = findMaxLength(names.toArray(new String[0]));
        int maxValueLength = findMaxLength(values.toArray(new String[0]));
        String format = "%-" + (maxNameLength + 2) + "s%-" + (maxValueLength + 2) + "s%s%n";

        for (int i = 0; i < names.size(); i++) {
            System.out.printf(format, names.get(i), values.get(i), costs.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i=0; i<n; ++i)
            values[i] = scanner.nextLine();
        printCheck(values);
    }
}