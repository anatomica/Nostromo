package ru.anatomica.Rover.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoverConfiguration {
    public static Logger logger = LoggerFactory.getLogger(RoverConfiguration.class);

    @Bean
    public CommandLineRunner loadService() {
        return args -> {
            logger.info("Start Rover");
        };
    }
}
