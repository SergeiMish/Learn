package ru.yandex.practicum;

import java.util.Optional;

public class OptionalNameDemo {

    static Optional<String> requestUserName() {
        //Здесь должен быть запрос к пользователю, но пока его не реализовали
        //Поместите в переменную username имя пользователя или оставьте ее пустой, если имя скрыто
        String username = "";

        if (username.isBlank()) {

            return Optional.empty();
            //вставьте код здесь
        } else {
            return Optional.of(username);
            //вставьте код здесь
        }
    }
    public static void main(String[] args) {
        Optional<String> maybeName = requestUserName();
        if (maybeName.isPresent()) {
            String name = maybeName.get();
            //вставьте код здесь
            System.out.println("Привет, " + name + "!");
        } else {
            System.out.println("Ваше право не называть имя!");
        }
    }
}