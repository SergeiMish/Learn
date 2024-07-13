import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories; // замените на таблицу с именем expensesByCategories
    ArrayList<Double> expenses;
    ExpensesManager() {
        expensesByCategories = new HashMap<>(); // создайте таблицу
        expenses = new ArrayList<>();
    }

    // добавьте в метод ещё один параметр — category
    double saveExpense(double moneyBeforeSalary, double expense, String category) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        ArrayList<Double>exp = new ArrayList<>();
        expensesByCategories.put(category, exp);
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
         expensesByCategories.get(category);// замените на работу с таблицей
        if (expensesByCategories.containsKey(category)){ // проверьте наличие категории
            expensesByCategories.get(category);
            exp.add(expense);
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

        for(String categoryes : expensesByCategories.keySet()){
            for (Double list : expensesByCategories.get(categoryes)){
                System.out.println(categoryes + " " + list);
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
            ArrayList<Double>maxExp = new ArrayList<>();
            expensesByCategories.get(maxExp);
            for (Double exp : maxExp) {
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