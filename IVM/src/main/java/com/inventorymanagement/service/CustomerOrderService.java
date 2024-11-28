package com.inventorymanagement.service;

import com.inventorymanagement.model.CustomerOrder;
import com.inventorymanagement.repository.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOrderService {

    @Autowired
    private CustomerOrderRepository customerOrderRepository;

    // GET - Retrieve all customer orders
    public List<CustomerOrder> getAllOrders() {
        return customerOrderRepository.findAll();
    }

    // GET - Retrieve a customer order by ID
    public CustomerOrder getOrderById(Long id) {
        return customerOrderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found with ID: " + id));
    }

    // POST - Create a new order
    public CustomerOrder createOrder(CustomerOrder order) {
        return customerOrderRepository.save(order);
    }

    // PUT - Update an existing order
    public CustomerOrder updateOrder(Long id, CustomerOrder updatedOrder) {
        CustomerOrder existingOrder = getOrderById(id);
        existingOrder.setCustomerName(updatedOrder.getCustomerName());
        existingOrder.setOrderDate(updatedOrder.getOrderDate());
        existingOrder.setOrderDetails(updatedOrder.getOrderDetails());
        return customerOrderRepository.save(existingOrder);
    }

    // PATCH - Partial update of a customer order
    public CustomerOrder partialUpdateOrder(Long id, CustomerOrder partialUpdate) {
        CustomerOrder existingOrder = getOrderById(id);
        if (partialUpdate.getCustomerName() != null) {
            existingOrder.setCustomerName(partialUpdate.getCustomerName());
        }
        if (partialUpdate.getOrderDate() != null) {
            existingOrder.setOrderDate(partialUpdate.getOrderDate());
        }
        if (partialUpdate.getOrderDetails() != null) {
            existingOrder.setOrderDetails(partialUpdate.getOrderDetails());
        }
        return customerOrderRepository.save(existingOrder);
    }

    // DELETE - Delete a customer order by ID
    public void deleteOrder(Long id) {
        customerOrderRepository.deleteById(id);
    }
}
