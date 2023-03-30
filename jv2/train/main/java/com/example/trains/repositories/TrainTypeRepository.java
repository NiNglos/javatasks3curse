package com.example.trains.repositories;

import com.example.trains.models.TrainType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainTypeRepository extends JpaRepository<TrainType, Integer> {
}
