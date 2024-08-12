package ru.yandex.practicum;

// Дополните класс для проверки суммы ипотеки пользователя
public class MortgageAmountValidationRule extends ValidationRule<Integer> {
    public int getValue() {
        return value;
    }

    private int value;
    public MortgageAmountValidationRule(Integer value) {
        super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
    }

    @Override
    public boolean isValid() {
        if (getValue() >= 1000000 && getValue() <= 10000000) {
            return false;
        }
        return true;
    }
    // Объявите и реализуйте метод для проверки суммы ипотеки ниже
    public Integer isMortgageBelow(Integer value) {
        if (getValue() >= 1000000 && getValue() <= 10000000) {
            return null;
        }
        return value;
    }
}