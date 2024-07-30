package ru.yandex.practicum;

import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;

    private static String season;

    // объявите недостающие переменные и добавьте конструктор
    public static void setSeason(String newSeason){
        season = newSeason;
        if (newSeason.equals("зима")){
            System.out.println("белый");
        }
        else {
            System.out.println("серо-рыжий");
        }
    }

    public static String getSeason() {
        return season;
    }
    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    // добавьте метод printHares()
    public void printHares(){
        for (MountainHare hare : hares){
            System.out.println(hare);
        }
    }
}