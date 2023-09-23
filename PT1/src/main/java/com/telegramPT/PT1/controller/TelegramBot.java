package com.telegramPT.PT1.controller;

import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Slf4j
@Component
public class TelegramBot extends TelegramLongPollingBot {
    final BotConfig config;

    public TelegramBot(BotConfig config) {
        this.config = config;
    }

    @Override
    public String getBotUsername() {
        return config.getBotName();
    }

    public String getBotToken() {
        return config.getToken();
    }

    @Override
    public void onUpdateReceived(@NotNull Update update) {
        var originalMessage = update.getMessage();
        System.out.println(originalMessage.getText());
    }
}
        if (update.hasMessage()&& update.getMessage().hasText()){
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();
            String memberName = update.getMessage().getFrom().getFirstName();

            switch (messageText){
                case "/start":
                    startBot(chatId, memberName);
                    break;
                default: log.info("Неправильно значение");
            }
//        }
//    }
//    private void startBot(long chatId, String userName){
//        SendMessage message = new SendMessage();
//        message.setChatId(chatId);
//        message.setText("Привет человек," + userName + "! Я бот телега, добро пожаловать!");
//        try {
//            execute(message);
//            log.info("Попробуй заново");
//        }catch (TelegramApiException e){
//            log.error(e.getMessage());
//        }
//    }
//}


