package ru.yandex.practicum;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.Map;

class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String response;

        // извлеките метод из запроса
        String method = httpExchange.getRequestMethod();

        switch (method) {
            case "POST":
                response = handlePostRequest(httpExchange);
                break;
            case "GET":
                response = handleGetRequest(httpExchange);
                break;
            // не забудьте про ответ для остальных методов
            default:
                response = "Вы использовали какой-то другой метод!";
        }

        httpExchange.sendResponseHeaders(200, 0);
        try (OutputStream os = httpExchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }

    private static String handleGetRequest(HttpExchange httpExchange) throws IOException {
        return "Здравствуйте!";
    }

    private static String handlePostRequest(HttpExchange httpExchange) throws IOException {
        // Извлеките path из запроса
        String path = httpExchange.getRequestURI().getPath();
        String[] splitStrings = path.split("/");
        // Извлеките профессию и имя из path
        String profession = splitStrings.length > 2 ? splitStrings[2] : "неизвестная профессия";
        String name = splitStrings.length > 3 ? splitStrings[3] : "неизвестное имя";

        // Извлеките тело запроса
        InputStream inputStream = httpExchange.getRequestBody();
        StringBuilder body = new StringBuilder();
        int i;
        while ((i = inputStream.read()) != -1) {
            body.append((char) i);
        }

        // Объедините полученные данные из тела и пути запроса
        String response = name + " " + profession + " " + body.toString();

        // Извлеките заголовок и в зависимости от условий дополните ответ
        Map<String, List<String>> requestHeaders = httpExchange.getRequestHeaders();
        List<String> wishGoodDay = requestHeaders.get("X-Wish-Good-Day");
        if (wishGoodDay != null && wishGoodDay.contains("true")) {
            response += ". Желаем хорошего дня!";
        }

        return response;
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