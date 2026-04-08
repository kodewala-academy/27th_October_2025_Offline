package com.zepto.product.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zepto.product.entity.ProductEntity;

// responsible for data base interaction(CRUD --> Create Update Read and Delete) 
@Repository
public class ProductRepository {

	@Autowired
	private SessionFactory sessionFactory;

	
	public String uploadProduct(String input) {

		String productId = java.util.UUID.nameUUIDFromBytes(input.getBytes()).toString().replace("-", "")
				.substring(0, 4).toUpperCase();

		// this object will be inserted as a record in the table
		ProductEntity product = new ProductEntity(productId, input);

		String prodId = (String) sessionFactory.getCurrentSession().save(product); // Create record in the table

		return prodId;
	}

}
