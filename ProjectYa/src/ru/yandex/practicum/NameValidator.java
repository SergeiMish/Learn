package ru.yandex.practicum;

public class NameValidator implements Validator {
    @Override
    public void validate(String name) throws ValidateException{
        if (name == null){
            throw new ValidateNameException("Имя не должно быть пустым");
        }
// допишите код класса
    }
}