import java.util.ArrayList; // импортируйте ArrayList

public class ExpensesManager {
    ArrayList<Double> expenses; // замените массив списком

    ExpensesManager() {
        expenses = new ArrayList<>(); // создайте список в конструкторе
    }

    // номер дня больше не нужен
    double saveExpense(double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        // эту строку нужно убрать
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses.get(i) + " рублей");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (Double exp : expenses) { // используйте сокращённую форму цикла
            if (exp > maxExpense) {
                maxExpense = exp;
            }
        }
        return maxExpense;
    }
}