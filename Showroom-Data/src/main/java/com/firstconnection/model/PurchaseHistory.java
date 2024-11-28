package com.firstconnection.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class PurchaseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String purchaseDate; // Changed from Long to String to store date as a string

    @ManyToOne
    @JoinColumn(name = "bike_id", nullable = false)
    @JsonBackReference  // Prevent circular reference to "bike"
    private Bike bike;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    @JsonBackReference  // Prevent circular reference to "customer"
    private Customer customer;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPurchaseDate() { // Updated getter to return a String
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) { // Updated setter to accept a String
        this.purchaseDate = purchaseDate;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
