package com.mywebsite.ecommerce.services;

import com.mywebsite.ecommerce.dto.OrderDTO;
import com.mywebsite.ecommerce.entities.Order;
import com.mywebsite.ecommerce.repositories.OrderRepository;
import com.mywebsite.ecommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}
