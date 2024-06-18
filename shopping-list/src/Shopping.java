import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {
                System.out.println("Введите товар");
                String productName = scanner.next();
                shoppingList[productCount] = productName;
                productCount += 1;
                for (int i = 0; i < shoppingList.length; i++) {
                    System.out.println("По индексу " + (i + 1) + " товар " + shoppingList[i]);
                }
            } else {
                System.out.println("Список покупок заполнен. Необходимо отдложить покупку на следующий раз.");

            }
            if (actionNumber == 2) {
                System.out.println("В вашем списке:");
                for (int i = 0; i < productCount; i++) {
                    System.out.println((i+1)+ " " + shoppingList[i]);
                }
                if (actionNumber == 3) {

                } else if (actionNumber == 4) {
                    break;
                } else {
                    System.out.println("Неизвестная команда!");
                }
            }
        }
    }
}
