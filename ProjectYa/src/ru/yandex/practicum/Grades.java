package ru.yandex.practicum;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
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
            String [] pureSplit = s.split(",");
            for (String s1 : pureSplit) {
                pureSplit[0] = capitalize(grades);
                pureSplit[1] = capitalize(grades);
                pureSplit[2] = grades.toLowerCase();
                pureSplit[3] = gradeToString(grades);
                System.out.println(s1);
            }
        }


//            if (i == 0 ){
//                capitalize(grades);
//            }
//            if (i == 1){
//                capitalize(grades);
//            }
//            if (i == 2){
//                grades.toLowerCase();
//                System.out.println(" - ");
//            }
//            if (i == 3){
//                gradeToString(grades);
//            }
        }
    }