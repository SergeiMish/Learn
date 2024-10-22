package ru.yandex.practicum;

import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherClient weatherClient = new WeatherClient();
        WeatherApplication weatherApp = new WeatherApplication(weatherClient);
        System.out.println("Приложение для получения информации о погоде.");
        System.out.println("Доступные города: Москва (MOW), Санкт-Петербург (LED), Казань (KZN)");
        while (true) {
            System.out.println("Введите код города (или 'exit' для выхода).");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                break;
            }

            weatherApp.displayWeather(command);
        }
    }
}