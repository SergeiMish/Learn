package ru.yandex.practicum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Practicum {
    public static void main(String[] args) {
        //создаём двухуровневую хеш-таблицу для хранения расписания уроков
        AdvancedHashMap<String, Integer, String> timetable = new AdvancedHashMap<>();
        //добавляем уроки, с указанием дня недели и номера урока
        timetable.put("Понедельник", 1, "Русский язык");
        timetable.put("Понедельник", 2, "Математика");
        timetable.put("Вторник", 1, "Физкультура");
        timetable.put("Вторник", 2, "Русский язык");

        //выводим первый урок во вторник
        System.out.println(timetable.get("Вторник", 1));

        //получаем и выводим все уроки в понедельник
        ArrayList<String> mondayLessons = timetable.getAll("Понедельник");
        System.out.println(mondayLessons);
    }

}

class AdvancedHashMap <K1, K2, V>  {
        //данные будем хранить в хеш-таблице из хеш-таблиц
        HashMap<Integer, String > internalHashMap = new HashMap<>();

public void put(...) {
        //получаем хеш-таблицу по первому ключу
        ... innerHashMap = ...;
        if (innerHashMap == null) {
        //вложенной хеш-таблицы по первому ключу пока нет — создаём её и добавляем в internalHashMap
        innerHashMap = new HashMap<>();
        ...
        }
        //добавляем элемент во вложенную хеш-таблицу
        ...
        }

public ... get(...) {
        //получаем хеш-таблицу по первому ключу
        ... innerHashMap = ...;
        if (innerHashMap == null) {
        return null;
        }
        //получаем элемент из вложенной хеш-таблицы
        return ...;
        }

public ... getAll(...) {
        ... innerHashMap = ...;
        if (innerHashMap == null) {
        return new ArrayList<>();
        }
        return new ArrayList<>(innerHashMap.values());
        }
        }