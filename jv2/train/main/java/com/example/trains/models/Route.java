package com.example.trains.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="routes")
@Data
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="departure")
    private City departure;

    @ManyToOne
    @JoinColumn(name="destination")
    private City destination;

    @ManyToOne
    @JoinColumn(name="train")
    private Train train;

    private Date departureTime;
    private Date arrivalTime;
}
