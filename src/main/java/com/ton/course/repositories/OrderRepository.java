package com.ton.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ton.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
