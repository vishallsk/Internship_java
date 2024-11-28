package com.firstconnection.controller;

import com.firstconnection.model.Bike;
import com.firstconnection.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bikes")
public class BikeController {

    @Autowired
    private BikeService bikeService;

    // Get all bikes
    @GetMapping
    public List<Bike> getAllBikes() {
        return bikeService.getAllBikes();
    }

    // Get bike by ID
    @GetMapping("/{id}")
    public Bike getBikeById(@PathVariable Long id) {
        return bikeService.getBikeById(id);
    }

    // Create a new bike
    @PostMapping
    public Bike createBike(@RequestBody Bike bike) {
        return bikeService.saveBike(bike);
    }

    // Update an existing bike
    @PutMapping("/{id}")
    public Bike updateBike(@PathVariable Long id, @RequestBody Bike bike) {
        bike.setId(id); // Set the id for update
        return bikeService.saveBike(bike);
    }

    // Delete a bike by ID
    @DeleteMapping("/{id}")
    public void deleteBike(@PathVariable Long id) {
        bikeService.deleteBike(id);
    }
}
