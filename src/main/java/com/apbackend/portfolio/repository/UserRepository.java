package com.apbackend.portfolio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apbackend.portfolio.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
Optional<User> findByEmail(String email);
}
