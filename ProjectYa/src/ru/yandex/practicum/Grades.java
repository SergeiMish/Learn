package ru.yandex.practicum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        StringBuilder sb = new StringBuilder();
        String[] split = grades.split(";");
        for (String s : split) {
            String[] s1 = s.split(",");
                if (s1.length == 4) {
                    String firstName = capitalize(s1[0]);
                    String lastName = capitalize(s1[1]);
                    String subject = s1[2].toLowerCase();
                    String grade = gradeToString(s1[3]);

                    sb.append(firstName)
                            .append(" ")
                            .append(lastName)
                            .append(" ")
                            .append(subject)
                            .append(" — ")
                            .append(grade)
                            .append("\n");
                }
            }

        System.out.println(sb);
    }
}