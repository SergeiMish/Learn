package com.telegramPT.PT1.controller;

import lombok.Data;
import lombok.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("config.properties")
public class BotConfig {
    @Value() String botName;
    @Value String token;
    @


}
