package com.inventorymanagement.service;

import com.inventorymanagement.model.InventoryItem;
import com.inventorymanagement.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    // GET - Retrieve all inventory items
    public List<InventoryItem> getAllItems() {
        return inventoryRepository.findAll();
    }

    // GET - Retrieve an inventory item by ID
    public InventoryItem getItemById(Long id) {
        return inventoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inventory item not found with ID: " + id));
    }

    // POST - Create a new inventory item
    public InventoryItem createItem(InventoryItem item) {
        return inventoryRepository.save(item);
    }

    // PUT - Update an existing inventory item
    public InventoryItem updateItem(Long id, InventoryItem updatedItem) {
        // Fetch the existing item
        InventoryItem existingItem = getItemById(id);

        // Update fields
        existingItem.setName(updatedItem.getName());
        existingItem.setQuantity(updatedItem.getQuantity());
        existingItem.setPrice(updatedItem.getPrice());

        // Save the updated item
        return inventoryRepository.save(existingItem);
    }

    // PATCH - Partial update of an inventory item
    public InventoryItem partialUpdateItem(Long id, InventoryItem partialUpdate) {
        // Fetch the existing item
        InventoryItem existingItem = getItemById(id);

        // Update only non-null fields
        if (partialUpdate.getName() != null) {
            existingItem.setName(partialUpdate.getName());
        }
        if (partialUpdate.getQuantity() !=0) {
            existingItem.setQuantity(partialUpdate.getQuantity());
        }
        if (partialUpdate.getPrice() != null) {
            existingItem.setPrice(partialUpdate.getPrice());
        }

        // Save the partially updated item
        return inventoryRepository.save(existingItem);
    }

    // DELETE - Delete an inventory item by ID
    public void deleteItem(Long id) {
        if (!inventoryRepository.existsById(id)) {
            throw new RuntimeException("Inventory item not found with ID: " + id);
        }
        inventoryRepository.deleteById(id);
    }
}
