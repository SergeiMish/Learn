import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();; // вместо многоточия используйте нужный метод класса Scanner


        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000) {
            // дополните условие проверкой на количество дней до зарплаты
            if (daysBeforeSalary < 10) {
                System.out.println("Можно заказать пиццу!");
            } else if (daysBeforeSalary >= 10) {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            }

        } else if (moneyBeforeSalary < 30000 && moneyBeforeSalary >= 10000) {
            // Допишите условие
            if (daysBeforeSalary < 10) {
                System.out.println("Неплохо! Сегодня можно поужинать в кафе.");
            } else if (daysBeforeSalary >= 10) {
                System.out.println("Можно заказать пиццу!");
            }

        } else { if (moneyBeforeSalary >= 30000){
            if (daysBeforeSalary < 10 ){
                System.out.println("Отлично! Можно сходить в ресторан.");
            }
            else if (daysBeforeSalary >= 10 ){
                System.out.println("Неплохо! Сегодня можно поужинать в кафе.");
            }
        }			// допишите условие
        }
    }
}