package com.firstconnection.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Updated from customerId to id

    private String name;
    private long mobileNo;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<PurchaseHistory> purchaseHistory;

    // Getters and Setters

    public Long getId() { // Updated getter name
        return id;
    }

    public void setId(Long id) { // Updated setter name
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PurchaseHistory> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(List<PurchaseHistory> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }
}
