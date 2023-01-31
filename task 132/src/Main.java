import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String Sergei;


        do {
            System.out.println("Введи своё имя");
            name = scanner.nextLine();
            Sergei = "Сергей";
                    }while (name == Sergei);
    }
}
