package com.telegramPT.PT1.controller;

import lombok.Data;
import lombok.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("application.properties")
public class BotConfig {
    @Value() String botName;
    @Value String token;
    @Value() String chatId;


}
