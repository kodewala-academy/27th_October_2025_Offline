package com.zepto.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_info")
public class ProductEntity {

	@Id
	private String productId;
	@Column
	private String name;

	public ProductEntity() {
	}

	public ProductEntity(String productId, String name) {
		this.productId = productId;
		this.name = name;
	}

}