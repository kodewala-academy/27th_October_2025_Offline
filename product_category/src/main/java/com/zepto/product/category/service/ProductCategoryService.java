package com.zepto.product.category.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.product.category.entity.Category;
import com.zepto.product.category.entity.Product;
import com.zepto.product.category.repository.ProductCategoryRepository;
import com.zepto.product.category.request.CategoryRequest;

import jakarta.transaction.Transactional;

@Service
public class ProductCategoryService {

	@Autowired
	ProductCategoryRepository productCategoryRepository;

	@Transactional
	public void getCategory(int categoryID) {
		System.out.println("ProductCategoryService.getCategory() START");
		Category category = productCategoryRepository.findById(categoryID).orElse(null);

		System.out.println("category details " + category.getId() + " " + category.getCategoryName()
				+ " and product Name : "  /*category.getProducts().get(0).getName()*/);

		System.out.println("ProductCategoryService.getCategory() END");

	}

	public void createCategory(CategoryRequest categoryRequest) {

		System.out.println("ProductCategoryService.createCategory()... START");
		Category category = new Category();
		category.setCategoryName(categoryRequest.getCategoryName());
		category.setDescription(categoryRequest.getCategoryDescription());
		category.setStatus(categoryRequest.getCategoryStatus());

		Product product = new Product();
		product.setDescription(categoryRequest.getProductDescription());
		product.setName(categoryRequest.getProductName());
		List<Product> products = new ArrayList<>();
		products.add(product);
		category.setProducts(products);

		product.setCategory(category);

		productCategoryRepository.save(category);
		System.out.println("ProductCategoryService.createCategory()... END");
	}
}
