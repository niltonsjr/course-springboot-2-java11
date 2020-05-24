package com.ton.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ton.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
