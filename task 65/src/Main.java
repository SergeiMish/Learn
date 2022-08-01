public class Main {
    public static void main(String[] args) {
        System.out.println("Делятся на 5: ");
        for (int i = 1; i < 100; i++) {
            if (i%5==0) System.out.print(i + ", ");
        }
        System.out.println("\nДелятся на 3: ");
        for (int i = 1; i < 100; i++) {
            if (i%3==0) System.out.print(i + ", ");
        }
        System.out.println("\nДелятся на 3 и 5: ");
        for (int i = 1; i < 100; i++) {
            if (i%5==0 && i%3==0) System.out.print(i + ", ");
            }
        }
    }