package ru.anatomica.Nostromo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import ru.anatomica.Nostromo.entity.Rover;
import ru.anatomica.Nostromo.entity.repository.RoverRepository;

@Configuration
public class NostromoConfiguration {
    public static Logger logger = LoggerFactory.getLogger(NostromoConfiguration.class);

    @Bean
    public CommandLineRunner loadService(RoverRepository roverRepository) {
        return args -> {
            logger.info("Start load data");
            logger.info("Data= {}", roverRepository.save(new Rover("Rover 1", "888")));
            logger.info("Data= {}", roverRepository.save(new Rover("Rover 2", "888")));
            logger.info("Data= {}", roverRepository.save(new Rover("Rover 3", "889")));
            logger.info("Data was loaded");
        };
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
