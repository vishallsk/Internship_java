package com.firstconnection.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private String bikeProperties; // For storing properties as a single string
    private String bikeBrand; // Brand name
    private String category; // Category of the bike

    @OneToMany(mappedBy = "bike", cascade = CascadeType.ALL)
    private List<PurchaseHistory> purchaseHistory;

    // Getters and Setters
    public Long getId() { // Updated method name
        return id;
    }

    public void setId(Long id) { // Updated method name
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

    public List<PurchaseHistory> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(List<PurchaseHistory> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }
}
