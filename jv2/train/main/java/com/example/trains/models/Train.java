package com.example.trains.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="trains")
@Data
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String trainName;
    @ManyToOne
    @JoinColumn(name="train_type")
    private TrainType trainType;
    private String trainNumber;
}
