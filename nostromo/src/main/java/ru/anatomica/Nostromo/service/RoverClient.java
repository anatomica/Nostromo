package ru.anatomica.Nostromo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RoverClient {

    @Autowired
    private DiscoveryClient discoveryClient;

    public List<String> getRoverPaths() {
        return discoveryClient.getInstances("Rover")
                .stream()
                .map(ServiceInstance::getUri)
                .map(URI::toString)
                .map((entry) -> entry + "/isAlive")
                .collect(Collectors.toList());
    }

    public List<String> getRoverUrls() {
        return discoveryClient.getInstances("Rover")
                .stream()
                .map(ServiceInstance::getUri)
                .map(URI::toString)
                .collect(Collectors.toList());
    }
}
