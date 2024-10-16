package ru.yandex.practicum;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.List;

class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String response;

        // извлеките метод из запроса
        String method = ...

        switch(...) {
            case ...:
                response = handlePostRequest(httpExchange);
            case ...:
                response = handleGetRequest(httpExchange);
                // не забудьте про ответ для остальных методов
            ...
        }

        httpExchange.sendResponseHeaders(200, 0);
        try (OutputStream os = httpExchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }

    private static String handleGetRequest(HttpExchange httpExchange) {
        // обработайте GET-запрос в соответствии с условиями задания
        ...
    }

    private static String handlePostRequest(HttpExchange httpExchange) throws IOException {
        // обработайте POST-запрос в соответствии с условиями задания

        // извлеките path из запроса
        String path = ...
        // а из path — профессию и имя
        String profession = ...
        String name = ...

        // извлеките тело запроса
        ...
        String body = ...

        // объедините полученные данные из тела и пути запроса
        String response = ...

        // извлеките заголовок и в зависимости от условий дополните ответ
        List<String> wishGoodDay = ...
        // верните полученную строку ответа
        ...
    }
}

public class Practicum {
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.start();
        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
        httpServer.stop(2);
    }
}