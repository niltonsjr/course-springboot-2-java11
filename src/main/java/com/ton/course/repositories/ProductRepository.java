package com.ton.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ton.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
