package com.inventorymanagement.service;

import com.inventorymanagement.model.Supplier;
import com.inventorymanagement.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    // GET - Retrieve all suppliers
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    // GET - Retrieve a supplier by ID
    public Supplier getSupplierById(Long id) {
        return supplierRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Supplier not found with ID: " + id));
    }

    // POST - Create a new supplier
    public Supplier createSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    // PUT - Update an existing supplier
    public Supplier updateSupplier(Long id, Supplier updatedSupplier) {
        Supplier existingSupplier = getSupplierById(id);
        existingSupplier.setName(updatedSupplier.getName());
        existingSupplier.setEmail(updatedSupplier.getEmail());
        existingSupplier.setContactNumber(updatedSupplier.getContactNumber());
        return supplierRepository.save(existingSupplier);
    }

    // PATCH - Partial update of a supplier
    public Supplier partialUpdateSupplier(Long id, Supplier partialUpdate) {
        Supplier existingSupplier = getSupplierById(id);
        if (partialUpdate.getName() != null) {
            existingSupplier.setName(partialUpdate.getName());
        }
        if (partialUpdate.getEmail() != null) {
            existingSupplier.setEmail(partialUpdate.getEmail());
        }
        if (partialUpdate.getContactNumber() != null) {
            existingSupplier.setContactNumber(partialUpdate.getContactNumber());
        }
        return supplierRepository.save(existingSupplier);
    }

    // DELETE - Delete a supplier by ID
    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }
}
