package com.telegramPT.PT1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;


@SpringBootApplication
public class Pt1Application {

	public static void main(String[] args) throws TelegramApiRequestException {
		ApiContextInitializer.init();

		TelegramBotsApi botsApi = new TelegramBotsApi();
		botsApi.registerBot(new EchoBot());
	}
}