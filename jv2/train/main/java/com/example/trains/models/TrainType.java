package com.example.trains.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name= "train_types")
@Data
public class TrainType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String typeName;
}
