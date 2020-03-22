package ru.anatomica.Rover.service;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Service;
import ru.anatomica.Rover.dto.Planet;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class ResearchService {

    private static Map<Integer, Planet> planetMap = new HashMap<>();
    private Planet planetForDiscovery;

    @PostConstruct
    public void planetGenerate() {
        planetMap.put(0, new Planet("Sun"));
        planetMap.put(1, new Planet("Mercury"));
        planetMap.put(2, new Planet("Venus"));
        planetMap.put(3, new Planet("Mars"));
        planetMap.put(4, new Planet("Earth"));
        planetMap.put(5, new Planet("Jupiter"));
        planetMap.put(6, new Planet("Saturn"));
        planetMap.put(7, new Planet("Uranus"));
        planetMap.put(8, new Planet("Neptune"));
        planetMap.put(9, new Planet("Pandora"));
        planetMap.put(10, new Planet("BlackStar"));
        planetMap.put(11, new Planet("X11"));

        // planetForDiscovery = planetMap.get(RandomUtils.nextInt(11));
    }

    public Planet getPlanetForDiscovery() {
        return planetMap.get(RandomUtils.nextInt(11));
    }
}
