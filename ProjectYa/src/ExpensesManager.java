import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories; // замените на таблицу с именем expensesByCategories
    ArrayList<Double>expenses = new ArrayList<>();
    ExpensesManager() {
        expensesByCategories = new HashMap<>(); // создайте таблицу
    }

    // добавьте в метод ещё один параметр — category
    double saveExpense(double moneyBeforeSalary, double expense, String category) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        expensesByCategories.put(category, expenses);
        expenses.add(expense);
         // замените на работу с таблицей
        if (expensesByCategories.containsKey(category)){ // проверьте наличие категории
            expensesByCategories.get(category);
            System.out.println(expensesByCategories);
    } else {
            ArrayList<Double>expenses2 = new ArrayList<>();// создайте новый список трат и добавьте в него сумму
            expensesByCategories.put(category,expenses2); // сохраните категорию и новый список трат в хеш-таблицу
    }
        if (moneyBeforeSalary < 1000) {
        System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
    }
        return moneyBeforeSalary;
}


    void printAllExpensesByCategories() {
        // Замените логику для работы с таблицами

        for(String category : expensesByCategories.keySet()){
            for (Double list : expensesByCategories.get(category)){
                System.out.println(category + " " + list);
            }
        }
    }
    // метод должен принимать название категории и называться findMaxExpenseInCategory
    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        /* Замените логику для работы с таблицами
        Если категория есть, то ищем максмальную трату.
        Иначе печатаем "Такой категории пока нет." */
        if(expensesByCategories.containsKey(category)){
            expenses.add(maxExpense);
            for (Double exp : expenses) {
                if (exp > maxExpense) {
                    maxExpense = exp;
                }
            }
        } else{
            System.out.println("Такой категории пока нет.");
        }
        return maxExpense;
    }
    void removeAllExpenses() {
        expensesByCategories.clear(); // таблица называется иначе
        System.out.println("Траты удалены.");
    }
}