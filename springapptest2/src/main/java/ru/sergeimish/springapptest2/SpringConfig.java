package ru.sergeimish.springapptest2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public  RapMusic rapMusic(){
        return new RapMusic();
    }
    @Bean MusicPlayer musicPlayer(){
    return new MusicPlayer(classicalMusic(), rockMusic(), rapMusic());
    }

    @Bean
    MusicPlayer.StyleMusic styleMusic() {
        return null;
    }
}
