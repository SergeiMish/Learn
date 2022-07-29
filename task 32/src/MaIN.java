<<<<<<< HEAD
import java.util.Scanner;

public class MaIN {
    public static void main(String[] args) {
        boolean exit;
        System.out.println("Без окон и дверей, полна горница людей");
        Scanner task = new Scanner(System.in);
        exit = false;
        for (int i = 1; i <= 3; i++) {
            if (exit == true) break;
            String question = task.nextLine();
            switch (question) {
                case "Огурец":
                    System.out.println("Умничка, возьми с полки пирожок");
                    exit = true;
                    break;
                default:
                    System.out.println("Неправльно, возьми с полки пирожок, облизни и полож на место.");
            }
        }
    }
=======
import java.util.Scanner;

public class MaIN {
    public static void main(String[] args) {
        boolean exit;
        System.out.println("Без окон и дверей, полна горница людей");
        Scanner task = new Scanner(System.in);
        exit = false;
        for (int i = 1; i <= 3; i++) {
            if (exit == true) break;
            String question = task.nextLine();
            switch (question) {
                case "Огурец":
                    System.out.println("Умничка, возьми с полки пирожок");
                    exit = true;
                    break;
                default:
                    System.out.println("Неправльно, возьми с полки пирожок, облизни и полож на место.");
            }
        }
    }
>>>>>>> origin/main
}