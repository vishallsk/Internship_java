package com.firstconnection.service;

import com.firstconnection.model.Bike;
import com.firstconnection.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeService {

    @Autowired
    private BikeRepository bikeRepository;

    // Retrieve all bikes
    public List<Bike> getAllBikes() {
        return bikeRepository.findAll();
    }

    // Retrieve a bike by its ID
    public Bike getBikeById(Long id) {
        return bikeRepository.findById(id).orElse(null);
    }

    // Save or update a single bike
    public Bike saveBike(Bike bike) {
        return bikeRepository.save(bike);
    }

    // Save or update multiple bikes
    public List<Bike> saveAllBikes(List<Bike> bikes) {
        return bikeRepository.saveAll(bikes);
    }

    // Delete a bike by its ID
    public void deleteBike(Long id) {
        bikeRepository.deleteById(id);
    }
}
