package config;

import lombok.Data;

@Configuration
@Data
@PropertySource("config.properties")
public class BotConfig {
}
