package ru.anatomica.Rover.dto;

import lombok.Data;

@Data
public class Planet {

    private String name;

    public Planet() {
    }

    public Planet(String name) {
        this.name = name;
    }
}
