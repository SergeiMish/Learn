package ru.yandex.practicum;

import java.util.Random;
import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(1000) + 1;
        System.out.println("Я загадал число. Попробуйте угадать!");

        Scanner s = new Scanner(System.in);
        int userGuess = -1;

        // Считывайте числа от пользователя пока не найдёте число, равное target
        while (userGuess != target){
            if (userGuess > target){
                System.out.println("Ваше число больше");
                s.nextInt();
            }
            else if (userGuess < target){
                System.out.println("Ваше число меньше");
                s.nextInt();
            }
            else {
                System.out.println("Правильный ответ");
                break;
            }
        }
    }
}