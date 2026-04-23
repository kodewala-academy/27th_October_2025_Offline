package com.zepto.product.category.request;

public class CategoryRequest {

	private String categoryName;
	private String categoryDescription;
	private String categoryStatus;

	private String productName;
	private String productDescription;
	private String productStatus;

	public String getCategoryName() {
		return categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public String getCategoryStatus() {
		return categoryStatus;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public void setCategoryStatus(String categoryStatus) {
		this.categoryStatus = categoryStatus;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

}
