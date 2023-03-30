package com.example.trains.services;

import com.example.trains.models.TrainType;
import com.example.trains.repositories.TrainTypeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TrainTypeService {
    @Autowired
    TrainTypeRepository trainTypeRepository;

    public List<TrainType> getAllTrainTypes() {
        return trainTypeRepository.findAll();
    }
    public TrainType getTrainType(Integer id) {
        return trainTypeRepository.findById(id).get();
    }

    public void save(TrainType trainType) {
        trainTypeRepository.save(trainType);
    }

}
