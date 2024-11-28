package com.firstconnection.controller;

import com.firstconnection.model.PurchaseHistory;
import com.firstconnection.service.PurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/purchase-history")
public class PurchaseHistoryController {

    @Autowired
    private PurchaseHistoryService purchaseHistoryService;

    // Get all purchase histories
    @GetMapping
    public List<PurchaseHistory> getAllPurchaseHistories() {
        return purchaseHistoryService.getAllPurchaseHistories();
    }

    // Get purchase history by ID
    @GetMapping("/{id}")
    public PurchaseHistory getPurchaseHistoryById(@PathVariable Long id) {
        return purchaseHistoryService.getPurchaseHistoryById(id);
    }

    // Create a new purchase history
    @PostMapping
    public PurchaseHistory createPurchaseHistory(@RequestBody PurchaseHistory purchaseHistory) {
        return purchaseHistoryService.savePurchaseHistory(purchaseHistory);
    }

    // Update an existing purchase history
    @PutMapping("/{id}")
    public PurchaseHistory updatePurchaseHistory(@PathVariable Long id, @RequestBody PurchaseHistory purchaseHistory) {
        purchaseHistory.setId(id);  // Set the ID for update
        return purchaseHistoryService.savePurchaseHistory(purchaseHistory);
    }

    // Delete a purchase history by ID
    @DeleteMapping("/{id}")
    public void deletePurchaseHistory(@PathVariable Long id) {
        purchaseHistoryService.deletePurchaseHistory(id);
    }
}
