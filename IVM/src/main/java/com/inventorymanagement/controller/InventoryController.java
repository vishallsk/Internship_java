package com.inventorymanagement.controller;

import com.inventorymanagement.model.InventoryItem;
import com.inventorymanagement.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping
    public List<InventoryItem> getAllItems() {
        return inventoryService.getAllItems();
    }

    @GetMapping("/item")
    public InventoryItem getItemById(@RequestParam Long id) {
        return inventoryService.getItemById(id);
    }

    @PostMapping
    public InventoryItem createInventoryItem(@RequestBody InventoryItem newItem) {
        return inventoryService.createItem(newItem);
    }

    @PutMapping("/item")
    public InventoryItem updateInventoryItem(@RequestParam Long id, @RequestBody InventoryItem updatedItem) {
        return inventoryService.updateItem(id, updatedItem);
    }

    @PatchMapping("/item")
    public InventoryItem partiallyUpdateInventoryItem(@RequestParam Long id, @RequestBody InventoryItem partialUpdate) {
        return inventoryService.partialUpdateItem(id, partialUpdate);
    }

    @DeleteMapping("/item")
    public String deleteInventoryItem(@RequestParam Long id) {
        inventoryService.deleteItem(id);
        return "Item with ID " + id + " has been deleted!";
    }
}
