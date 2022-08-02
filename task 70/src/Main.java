import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите секунды");
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int hour = sec/3600;
        int mm = ((sec - (hour*3600)) /60);
        int ss = (((sec - (hour*3600)) - mm) / 60);
        System.out.println(hour + " " + mm + " " + ss);
    }
}
