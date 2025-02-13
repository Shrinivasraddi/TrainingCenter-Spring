package com.example.service;

import com.example.model.TrainingCenter;
import com.example.repository.TrainingCenterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCenterService {

    private final TrainingCenterRepository trainingCenterRepository;

    public TrainingCenterService(TrainingCenterRepository trainingCenterRepository) {
        this.trainingCenterRepository = trainingCenterRepository;
    }

    public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
        return trainingCenterRepository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return trainingCenterRepository.findAll();
    }
}
