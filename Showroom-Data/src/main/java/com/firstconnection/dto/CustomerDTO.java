package com.firstconnection.dto;

import java.util.List;

public class CustomerDTO {

    private Long id;
    private String name;
    private long mobileNo;
    private Long userId; // Maps the user_id from Customer entity
    private List<Long> purchaseHistoryIds; // Maps the IDs of PurchaseHistory

    // Constructors
    public CustomerDTO() {
    }

    public CustomerDTO(Long id, String name, long mobileNo, Long userId, List<Long> purchaseHistoryIds) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.userId = userId;
        this.purchaseHistoryIds = purchaseHistoryIds;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getPurchaseHistoryIds() {
        return purchaseHistoryIds;
    }

    public void setPurchaseHistoryIds(List<Long> purchaseHistoryIds) {
        this.purchaseHistoryIds = purchaseHistoryIds;
    }
}
