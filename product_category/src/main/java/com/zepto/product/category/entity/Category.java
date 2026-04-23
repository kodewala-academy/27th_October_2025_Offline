package com.zepto.product.category.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "category_name")
	private String categoryName;
	private String description;
	private String status;

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	private List<Product> products = new ArrayList<>();

	public int getId() {
		return id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public String getDescription() {
		return description;
	}

	public String getStatus() {
		return status;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
