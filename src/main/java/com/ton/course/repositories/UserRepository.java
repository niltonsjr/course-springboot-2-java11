package com.ton.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ton.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
