import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
     if (a<5){
         System.out.println("Маловато будет");
     }
     else if (a>20){
         System.out.println("Великовато будет");
     }
     else System.out.println("Вроде норм");
    }
}
