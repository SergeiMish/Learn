package ru.yandex.practicum;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class Practicum {

    public static void main(String[] args) throws IOException, InterruptedException {
        // укажите URL-адрес ресурса
        URI uri = URI.create("https://ya.ru/white");

        // создайте объект, описывающий HTTP-запрос
        HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();

        // создайте HTTP-клиент с настройками по умолчанию
        HttpClient client = HttpClient.newHttpClient();

        // получите стандартный обработчик тела запроса
        // с конвертацией содержимого в строку
        HttpResponse.BodyHandler<String> handler = ... ;

        // отправьте запрос
        HttpResponse<String> response = ... ;

        // выведите код состояния и тело ответа
    }
}