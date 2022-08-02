import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        for (int i=1; i<10; i++){
            if (number>0){
                int x = number / i;
                System.out.print(i);
            }
        }

    }
}
