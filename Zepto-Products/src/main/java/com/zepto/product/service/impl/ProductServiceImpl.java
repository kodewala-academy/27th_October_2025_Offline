package com.zepto.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.product.entity.ProductEntity;
import com.zepto.product.repository.ProductRepository;
import com.zepto.product.request.ProductRequest;
import com.zepto.product.request.ProductResponse;
import com.zepto.product.service.IProductService;

import jakarta.transaction.Transactional;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	ProductRepository productRepository;

	@Transactional
	@Override
	public ProductResponse createProduct(ProductRequest productRequest) {

		String productName = productRequest.getProductName();
		String qty = productRequest.getQty();
		String description = productRequest.getDescription();
		String price = productRequest.getPrice();
		String soldBy = productRequest.getSoldBy();

		System.out.println("ProductServiceImpl --> Received from Seller " + productName + " " + qty + " " + description
				+ " " + price + " " + soldBy);

		ProductEntity entity = new ProductEntity();
		entity.setName(productName);
		entity.setStatus("CREATED");
		entity.setProductId(java.util.UUID.randomUUID().toString());

		ProductEntity saved = productRepository.save(entity); // Calling save method.

		ProductResponse response = new ProductResponse();

		if (saved != null) {
			response.setProductId(String.valueOf(saved.getId())); // DB generated ID
			response.setConfirmationMsg("Your product has been uploaded successfully!");
		} else {
			response.setConfirmationMsg("Unable to upload the product!");
		}

		return response;
	}

	@Transactional
	@Override
	public String checkProductStatus(int productId) {

		ProductEntity entity = productRepository.findById(productId).orElse(null);

		if (entity != null) {
			return entity.getStatus();
		}

		return "PRODUCT NOT FOUND";
	}
}