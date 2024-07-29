package ru.yandex.practicum;
import java.util.ArrayList;
public class LostAndFoundOffice {
    // создайте список things
    ArrayList<Object> things = new ArrayList<>();
    // реализуйте метод put()
    public void put(Object element){
        things.add(element);
        }
    public boolean check(Object target){
        if(target == null){
            return false;
        }
        else if (target.equals(things)){
            return true;
        }
        return false;
    }

    // реализуйте метод check()

    for (Object object : things) { // логика проверки вещи в списке
        if(object.equals(target)) {
            return true;
        }
    }
