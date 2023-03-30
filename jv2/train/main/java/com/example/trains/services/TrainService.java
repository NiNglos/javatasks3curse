package com.example.trains.services;

import com.example.trains.models.Train;
import com.example.trains.repositories.TrainRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TrainService {
    @Autowired
    TrainRepository trainRepository;

    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }
    public Train getTrain(Integer id) {
        return trainRepository.findById(id).get();
    }

    public void save(Train train) {
        trainRepository.save(train);
    }

}
