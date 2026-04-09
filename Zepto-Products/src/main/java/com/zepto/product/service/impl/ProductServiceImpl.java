package com.zepto.product.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.product.repository.ProductRepository;
import com.zepto.product.request.ProductRequest;
import com.zepto.product.request.ProductResponse;
import com.zepto.product.service.IProductService;

// All the business logic
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

		System.out.println("ProductServiceImpl -->  Received from Seller " + productName + " " + qty + " " + description
				+ " " + price + " " + soldBy);

		String input = productName + qty;
        
		String status="CREATED";
        
		// Calling DAO / Repository Layer
		String productId = productRepository.uploadProduct(input, status);

		ProductResponse productResponse = new ProductResponse();
		if (productId != null) {
			productResponse.setProductId(productId);
			productResponse.setConfirmationMsg("You product has been uploaded. It will be live on catalog soon!!");
		} else {
			productResponse.setProductId(productId);
			productResponse.setConfirmationMsg("Unable to upload the product!");
		}
		return productResponse;
	}

	@Transactional
	@Override
	public String checkProductStatus(int productId) {
		String status = productRepository.getProductAndCheckStatus(productId);
		return status;
	}

}
