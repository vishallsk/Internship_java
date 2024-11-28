package com.firstconnection.dto;

public class BikeDTO {

    private Long id; // Bike ID
    private String bikeProperties; // Properties as a single string
    private String bikeBrand; // Brand name
    private String category; // Bike category

    // Constructors
    public BikeDTO() {
    }

    public BikeDTO(Long id, String bikeProperties, String bikeBrand, String category) {
        this.id = id;
        this.bikeProperties = bikeProperties;
        this.bikeBrand = bikeBrand;
        this.category = category;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBikeProperties() {
        return bikeProperties;
    }

    public void setBikeProperties(String bikeProperties) {
        this.bikeProperties = bikeProperties;
    }

    public String getBikeBrand() {
        return bikeBrand;
    }

    public void setBikeBrand(String bikeBrand) {
        this.bikeBrand = bikeBrand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
