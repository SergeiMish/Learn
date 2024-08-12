package ru.yandex.practicum;

// Дополните класс для проверки суммы ипотеки пользователя
public class MortgageAmountValidationRule extends ValidationRule<Integer> {

public MortgageAmountValidationRule(Integer value) {
        super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
        }

    @Override
    public boolean isValid() {
        return false;
    }

    // Объявите и реализуйте метод для проверки суммы ипотеки ниже
        ...

        }