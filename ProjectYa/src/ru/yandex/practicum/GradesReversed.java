package ru.yandex.practicum;

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
        String join = null;
        for (String grade : grades) {
            String[] split = grade.split(" ");
            if(split.length == 5){
                String firstName = split[0];
                String lastName = split[1];
                String subject = split[2];
                String gradee = gradeStringToInt(split[4]);
                join = String.join(firstName, lastName, subject, gradee);
            }
            System.out.println(join);
        }
    return join;
    }
}

//    StringBuilder sb = new StringBuilder();
//    String[] split = grades.split(";");
//        for (String s : split) {
//                String[] s1 = s.split(",");
//                if (s1.length == 4) {
//                String firstName = capitalize(s1[0]);
//                String lastName = capitalize(s1[1]);
//                String subject = s1[2].toLowerCase();
//                String grade = gradeToString(s1[3]);
//
//                sb.append(firstName)
//                .append(" ")
//                .append(lastName)
//                .append(" ")
//                .append(subject)
//                .append(" — ")
//                .append(grade)
//                .append("\n");
//                }
//                }
//
//                System.out.println(sb);