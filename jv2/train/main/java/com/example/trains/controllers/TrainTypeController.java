package com.example.trains.controllers;

import com.example.trains.models.TrainType;
import com.example.trains.services.TrainTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/train_types")
public class TrainTypeController {
    @Autowired
    TrainTypeService trainTypeService;

    @GetMapping("")
    public List<TrainType> getAllTrainTypes() {
        return trainTypeService.getAllTrainTypes();
    }

    @GetMapping("/{id}")
    public TrainType getTrainTypeById(@PathVariable Integer id) {
        return trainTypeService.getTrainType(id);

    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody TrainType trainType) {
        trainTypeService.save(trainType);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody TrainType city, @PathVariable Integer id) {
        try {
            trainTypeService.getTrainType(id);
            city.setId(id);
            trainTypeService.save(city);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<TrainType>(HttpStatus.NOT_FOUND);
        }
    }

}
