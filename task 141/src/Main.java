import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите 0");
        Scanner scanner = new Scanner(System.in);
        while (true){
           int x = Integer.parseInt(scanner.nextLine());
           if (x != 0){
               try {
                   throw new IOException();
               }catch (IOException e) {
                   System.out.println("Вы ввели не 0");
               }
           }else System.out.println("Молодец, возьми с полки пирожок");

        }

    }
}
