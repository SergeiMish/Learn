package ru.yandex.practicum;
import java.util.ArrayList;
public class LostAndFoundOffice {
    // создайте список things

    // реализуйте метод put()

    // реализуйте метод check()

    for (Object object : things) { // логика проверки вещи в списке
        if(object.equals(target)) {
            return true;
        }
    }