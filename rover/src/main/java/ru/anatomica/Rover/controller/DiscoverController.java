package ru.anatomica.Rover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.anatomica.Rover.dto.Planet;
import ru.anatomica.Rover.service.ResearchService;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class DiscoverController {

    @Autowired
    private ResearchService researchService;

    @RequestMapping(
            value = "/discover/planet",
            method = RequestMethod.GET,
            produces = APPLICATION_JSON_VALUE)
    public Planet discoverPlanet() {
        return researchService.getPlanetForDiscovery();
    }
}
