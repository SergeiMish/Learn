import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0){
                System.out.println("Яндекс");
            }
            else if (i % 5 == 0){
                System.out.println("Практикум");
            }
            else  if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Яндекс.Практикум");
            }
            else System.out.println(i);
        }
    }
}