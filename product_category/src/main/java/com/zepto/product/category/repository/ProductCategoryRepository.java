package com.zepto.product.category.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zepto.product.category.entity.Category;

@Repository
public interface ProductCategoryRepository extends CrudRepository<Category, Integer> {

}
