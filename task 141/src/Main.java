import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
           int x = Integer.parseInt(scanner.nextLine());
           if (x != 0){
               System.out.println("Введите 0");
           }
        }

    }
}
