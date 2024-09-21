package ru.yandex.practicum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        String join;
        StringBuilder sb = new StringBuilder();
        for (String grade : grades) {
            String[] split = grade.split(" ");
            if(split.length == 5){
                String firstName = split[0];
                String lastName = split[1];
                String subject = split[2];
                String gradee = gradeStringToInt(split[4]);
                join = String.join(",", firstName, lastName, subject, gradee);
                sb.append(join.toLowerCase()).append(";");
            }
        }
    return sb.toString();
    }
}
