package ru.anatomica.Nostromo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.anatomica.Nostromo.config.NostromoConfiguration;
import ru.anatomica.Nostromo.entity.Rover;
import ru.anatomica.Nostromo.entity.repository.RoverRepository;
import java.util.List;

@Service
public class RoverService {

    private final RoverRepository roverRepository;

    @Autowired
    public RoverService(RoverRepository roverRepository) {
        this.roverRepository = roverRepository;
    }

    public List<Rover> getAllRovers() {
        NostromoConfiguration.logger.info("Get all Rovers");
        return roverRepository.findAll();
    }
}
