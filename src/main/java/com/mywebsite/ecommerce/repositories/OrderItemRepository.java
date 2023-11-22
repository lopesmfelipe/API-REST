package com.mywebsite.ecommerce.repositories;

import com.mywebsite.ecommerce.entities.OrderItem;
import com.mywebsite.ecommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
