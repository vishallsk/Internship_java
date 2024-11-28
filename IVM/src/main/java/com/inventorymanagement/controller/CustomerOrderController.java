package com.inventorymanagement.controller;

import com.inventorymanagement.model.CustomerOrder;
import com.inventorymanagement.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer-orders")
public class CustomerOrderController {

    @Autowired
    private CustomerOrderService customerOrderService;


    @GetMapping
    public List<CustomerOrder> getAllCustomerOrders() {
        return customerOrderService.getAllOrders();
    }


    @GetMapping("/{id}")
    public CustomerOrder getCustomerOrderById(@PathVariable Long id) {
        return customerOrderService.getOrderById(id);
    }


    @PostMapping
    public CustomerOrder createCustomerOrder(@RequestBody CustomerOrder newOrder) {
        return customerOrderService.createOrder(newOrder);
    }


    @PutMapping("/{id}")
    public CustomerOrder updateCustomerOrder(@PathVariable Long id, @RequestBody CustomerOrder updatedOrder) {
        return customerOrderService.updateOrder(id, updatedOrder);
    }

   
    @PatchMapping("/{id}")
    public CustomerOrder partiallyUpdateCustomerOrder(@PathVariable Long id, @RequestBody CustomerOrder partialUpdate) {
        return customerOrderService.partialUpdateOrder(id, partialUpdate);
    }

   
    @DeleteMapping("/{id}")
    public String deleteCustomerOrder(@PathVariable Long id) {
        customerOrderService.deleteOrder(id);
        return "Customer order with ID " + id + " has been deleted!";
    }
}
