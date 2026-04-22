package com.zepto.product.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_info")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String productId;
	@Column
	private String name;

	@Column
	private String status;
	
	@OneToOne(mappedBy = "productEntity" , cascade = CascadeType.ALL)
	private PriceEntity price;

	public ProductEntity() {
	}

	public ProductEntity(String productId, String name, String status) {
		this.productId = productId;
		this.name = name;
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public PriceEntity getPrice() {
		return price;
	}

	public void setPrice(PriceEntity price) {
		this.price = price;
	}
}