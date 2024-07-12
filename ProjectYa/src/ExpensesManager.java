import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories; // замените на таблицу с именем expensesByCategories

    ExpensesManager() {
        expensesByCategories = new HashMap<>(); // создайте таблицу
    }

    // добавьте в метод ещё один параметр — category
    double saveExpense(double moneyBeforeSalary, double expense, String category) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        expensesByCategories.get(moneyBeforeSalary); // замените на работу с таблицей
        if (expensesByCategories.containsKey(category)){ // проверьте наличие категории
            expensesByCategories.get(expense); // получите список трат в этой категории
            expensesByCategories.put(category, expense);// добавьте трату
    } else {
            ... // создайте новый список трат и добавьте в него сумму
            ... // сохраните категорию и новый список трат в хеш-таблицу
    }
        if (moneyBeforeSalary < 1000) {
        System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
    }
        return moneyBeforeSalary;
}


    void printAllExpenses() {
        // замените логику для работы с таблицами
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses.get(i) + " рублей");
        }
    }

    // метод должен принимать название категории и называться findMaxExpenseInCategory
    double findMaxExpense() {
        double maxExpense = 0;
        /* Замените логику для работы с таблицами
        Если категория есть, то ищем максмальную трату.
        Иначе печатаем "Такой категории пока нет." */
        for (Double exp : expenses) {
            if (exp > maxExpense) {
                maxExpense = exp;
            }
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expenses.clear(); // таблица называется иначе
        System.out.println("Траты удалены.");
    }
}