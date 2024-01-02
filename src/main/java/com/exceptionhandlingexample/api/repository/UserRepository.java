package com.exceptionhandlingexample.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exceptionhandlingexample.api.entity.User;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}