import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0){
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("Не то пальто");
                    break;
                }

            }
        }
    }
}
