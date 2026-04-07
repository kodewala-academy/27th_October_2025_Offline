package com.zepto.product.repository;

import org.springframework.stereotype.Repository;

// responsible for data base interaction(CRUD --> Create Update Read and Delete) 
@Repository
public class ProductRepository {

	public String uploadProduct(String _input) {
		
		String productId = java.util.UUID.nameUUIDFromBytes(_input.getBytes()).toString().replace("-", "")
				.substring(0, 4).toUpperCase();
		return productId;
	}

}
