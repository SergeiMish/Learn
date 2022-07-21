import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String yes = "Ляйсан";
        String R = "Руслан";
        String S = "Света";
        String M = "Сергей";
        String name;
        System.out.println("Введите имя милашки: ");
        Scanner scr = new Scanner(System.in);
        name = scr.nextLine();
        while (true) {
            if (!name.equals(yes)) System.out.println("Ищи лучше!");
            name = scr.nextLine();
            if (name.equals(yes)) System.out.println("Пупсичка обнаружена!!!");
            else if (name.equals(R)) System.out.println("Это же брат Руслан!");
            else if (name.equals(S)) System.out.println("Это Света, подруга ");
            else if (name.equals(M)) System.out.println("Это же твой МУЖ!!!");
        }
    }
}