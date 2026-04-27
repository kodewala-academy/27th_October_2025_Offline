package com.zepto.product.category.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zepto.product.category.entity.Category;

@Repository
public interface ProductCategoryRepository extends CrudRepository<Category, Integer> {

	/*
	 * @EntityGraph(attributePaths = "products") public Iterable<Category>
	 * findAll();
	 */
	@Query("select c from Category c join fetch c.products")
	public Iterable<Category> findAll();
}
