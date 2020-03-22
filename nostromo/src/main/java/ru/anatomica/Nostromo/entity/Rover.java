package ru.anatomica.Nostromo.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Rover {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String model;

    public Rover() {
    }

    public Rover(String name, String model) {
        this.name = name;
        this.model = model;
    }
}
