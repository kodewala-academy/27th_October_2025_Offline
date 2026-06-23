package com.kodewala.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodewala.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);
}