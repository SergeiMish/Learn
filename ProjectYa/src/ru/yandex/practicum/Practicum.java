package ru.yandex.practicum;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

class PostsHandler implements HttpHandler {
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;
    @Override
    public void handle(HttpExchange exchange) throws IOException {

        // получите информацию об эндпоинте, к которому был запрос
        Endpoint endpoint = getEndpoint(exchange.getRequestURI().getPath(), exchange.getRequestMethod());

        switch (endpoint) {
            case GET_POSTS: {
                writeResponse(exchange, "Получен запрос на получение постов", 200);
                break;
            }
            case GET_COMMENTS: {
                writeResponse(exchange, "Получен запрос на получение комментариев", 200);
                break;
            }
            case POST_COMMENT: {
                writeResponse(exchange, "Получен запрос на добавление комментария", 200);
                break;
            }
            default:
                writeResponse(exchange, "Такого эндпоинта не существует", 404);
        }
    }

    private Endpoint getEndpoint(String requestPath, String requestMethod) {
        String[] pathParts = requestPath.split("/");
        // Реализуйте этот метод, проанализировав путь и метод запроса
        if ("GET".equalsIgnoreCase(requestMethod) && pathParts.length == 2 && "posts".equals(pathParts[1])) {
            return Endpoint.GET_POSTS;
        } else if ("GET".equalsIgnoreCase(requestMethod) && pathParts.length == 4 && "posts".equals(pathParts[1]) && "comments".equals(pathParts[3])) {
            return Endpoint.GET_COMMENTS;
        } else if ("POST".equalsIgnoreCase(requestMethod) && pathParts.length == 4 && "posts".equals(pathParts[1]) && "comments".equals(pathParts[3])) {
            return Endpoint.POST_COMMENT;
        } else {
            return Endpoint.UNKNOWN;
        }
    }

    private void writeResponse(HttpExchange exchange, String responseString, int responseCode) throws IOException {
        byte[] responseBytes = responseString.getBytes(DEFAULT_CHARSET);
        exchange.sendResponseHeaders(responseCode, responseString.isEmpty() ? -1 : responseBytes.length);

        try (OutputStream os = exchange.getResponseBody()) {
            if (!responseString.isEmpty()) {
                os.write(responseBytes);
            }
        }
            /*
             Реализуйте отправку ответа, который содержит responseString в качестве тела ответа
             и responseCode в качестве кода ответа.
             Учтите, что если responseString — пустая строка, то её не нужно передавать в ответе.
             В этом случае ответ отправляется без тела.
             */
        // ...
    }

    enum Endpoint {GET_POSTS, GET_COMMENTS, POST_COMMENT, UNKNOWN}
}

public class Practicum {
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/posts", new PostsHandler());
        // добавьте код для конфигурирования и запуска сервера
        httpServer.start();

        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
        // завершаем работу сервера для корректной работы тренажёра
        httpServer.stop(1);
    }
}