package ru.yandex.practicum;

import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;
    private static String season;

    public static void setSeason(String newSeason) {
        Forest.season = newSeason;
        if (newSeason.equals("зима")) {
            MountainHare.setColor("белый");
        } else {
            MountainHare.setColor("серо-рыжий");
        }
    }

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }
    // объявите недостающие переменные и добавьте конструктор

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    // добавьте метод printHares()
    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}