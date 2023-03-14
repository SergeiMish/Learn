package ru.sergeimish.springapptest2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.sergeimish.springapptest2")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
