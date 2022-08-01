import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите значение: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        for(char c : number.toCharArray())
            if(Character.isDigit(c)) System.out.println("Целочисленное значение: " +c);
    }
}
