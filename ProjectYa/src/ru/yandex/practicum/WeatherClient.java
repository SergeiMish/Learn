package ru.yandex.practicum;

//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//
//class WeatherClient {
//    private final HttpClient client;
//
//    // Конструктор по умолчанию
//    WeatherClient() {
//        this.client = HttpClient.newHttpClient();
//    }
//
//    // Метод для получения данных о погоде
//    String getWeatherData(String cityCode) {
//        String url = "https://functions.yandexcloud.net/d4eo3a1nvqedpic89160?scale=C&city=" + cityCode;
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(url))
//                .GET()
//                .build();
//
//        try {
//            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            if (response.statusCode() == 200) {
//                JsonElement jsonElement = JsonParser.parseString(response.body());
//                if (!jsonElement.isJsonObject()) {
//                    return "Ответ от сервера не соответствует ожидаемому.";
//                }
//
//                JsonObject jsonObject = jsonElement.getAsJsonObject();
//                JsonObject cityData = jsonObject.getAsJsonObject("cities").getAsJsonObject(cityCode);
//
//                String city = cityData.get("city").getAsString();
//                String conditions = cityData.get("conditions").getAsString();
//                String temperature = cityData.get("temperature").getAsString();
//
//                return "Город: " + city + ". " + conditions + ", " + temperature;
//            } else {
//                return "Что-то пошло не так. Сервер вернул код состояния: " + response.statusCode();
//            }
//        } catch (IOException | InterruptedException e) {
//            return "Во время выполнения запроса возникла ошибка.\n" +
//                    "Проверьте, пожалуйста, параметры запроса и повторите попытку.";
//        }
//    }
//}