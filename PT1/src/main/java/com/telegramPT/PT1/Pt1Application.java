package com.telegramPT.PT1;
import com.telegramPT.PT1.controller.BotConfig;
import org.telegram.telegrambots.ApiContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;


@SpringBootApplication
public class Pt1Application {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
		try {
			telegramBotsApi.registerBot(BotConfig.getBot());
		} catch (TelegramApiRequestException e) {
			e.printStackTrace();
		}
	}
}