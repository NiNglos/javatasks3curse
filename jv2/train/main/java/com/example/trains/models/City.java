package com.example.trains.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="cities")
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
