package com.zepto.product.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zepto.product.entity.ProductEntity;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {

	public void findByProductName(String name); 
}