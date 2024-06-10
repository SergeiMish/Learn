import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 8;
        String result = "A";

        if (number > 5) {
            result = "B";
        }

        if (number % 3 == 0) {
            result = "C";
        }

        boolean condition = number >= 10;
        if (condition) {
            result = "C";
        }
        System.out.println(result);
    }
}