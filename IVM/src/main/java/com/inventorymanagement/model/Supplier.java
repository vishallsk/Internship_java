package com.inventorymanagement.model;

import jakarta.persistence.*;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contactInfo;
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
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public Object getEmail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmail'");
    }
    public void setEmail(Object email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEmail'");
    }
    public Object getContactNumber() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getContactNumber'");
    }
    public void setContactNumber(Object contactNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setContactNumber'");
    }

}
