import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secondsBeforeStart = 70; // Секунды до старта, цикл должен начинаться с этого значения
        for (int i = 7; i == secondsBeforeStart; i--){
            System.out.println("До старта SpaceY осталось" + i);
        }

        System.out.println("Поехали! Узнаем, есть ли жизнь на Марсе!");
    }
}