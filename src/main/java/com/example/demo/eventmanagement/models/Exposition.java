package com.example.demo.eventmanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "expositions")
public class Exposition extends Event {

    public Exposition() {
    }

    public Exposition(LocalDate date, Integer duration, String location, String title) {
        super(date, duration, location, title);
    }


}
