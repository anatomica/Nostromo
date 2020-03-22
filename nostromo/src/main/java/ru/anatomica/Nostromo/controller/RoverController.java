package ru.anatomica.Nostromo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.anatomica.Nostromo.dto.Planet;
import ru.anatomica.Nostromo.entity.Rover;
import ru.anatomica.Nostromo.service.RoverClient;
import ru.anatomica.Nostromo.service.RoverDiscoveryPlanet;
import ru.anatomica.Nostromo.service.RoverService;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class RoverController {

    @Autowired
    private RoverService roverService;
    @Autowired
    private RoverClient roverClient;
    @Autowired
    private RoverDiscoveryPlanet roverDiscoveryPlanet;

    @RequestMapping(
            value = "/rover/all",
            method = RequestMethod.GET,
            produces = APPLICATION_JSON_VALUE)
    public List<Rover> getAllRovers() {
        return roverService.getAllRovers();
    }

    @RequestMapping(
            value = "/rover/available",
            method = RequestMethod.GET,
            produces = APPLICATION_JSON_VALUE)
    public List<String> getAvailableRovers() {
        return roverClient.getRoverPaths();
    }

    @RequestMapping(
            value = "/rover/discover",
            method = RequestMethod.GET,
            produces = APPLICATION_JSON_VALUE)
    public List<Planet> discoverPlanet() {
        return roverDiscoveryPlanet.getDiscoveryListPlanet();
    }
}
