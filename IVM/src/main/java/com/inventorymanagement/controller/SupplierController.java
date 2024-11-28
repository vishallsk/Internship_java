package com.inventorymanagement.controller;

import com.inventorymanagement.model.Supplier;
import com.inventorymanagement.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    // GET - Retrieve all suppliers
    @GetMapping
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    // GET - Retrieve a supplier by ID
    @GetMapping("/{id}")
    public Supplier getSupplierById(@PathVariable Long id) {
        return supplierService.getSupplierById(id);
    }

    // POST - Create a new supplier
    @PostMapping
    public Supplier createSupplier(@RequestBody Supplier newSupplier) {
        return supplierService.createSupplier(newSupplier);
    }

    // PUT - Update an existing supplier
    @PutMapping("/{id}")
    public Supplier updateSupplier(@PathVariable Long id, @RequestBody Supplier updatedSupplier) {
        return supplierService.updateSupplier(id, updatedSupplier);
    }

    // PATCH - Partial update of a supplier
    @PatchMapping("/{id}")
    public Supplier partiallyUpdateSupplier(@PathVariable Long id, @RequestBody Supplier partialUpdate) {
        return supplierService.partialUpdateSupplier(id, partialUpdate);
    }

    // DELETE - Delete a supplier by ID
    @DeleteMapping("/{id}")
    public String deleteSupplier(@PathVariable Long id) {
        supplierService.deleteSupplier(id);
        return "Supplier with ID " + id + " has been deleted!";
    }
}
