package com.telegramPT.PT1;

import com.telegramPT.PT1.controller.TelegramBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
public class Pt1Application {

//	public static void main(String[] args) {
//		SpringApplication.run(Pt1Application.class, args);
//	}
//}
