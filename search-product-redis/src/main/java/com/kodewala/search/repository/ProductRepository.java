package com.kodewala.search.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodewala.search.entiry.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}