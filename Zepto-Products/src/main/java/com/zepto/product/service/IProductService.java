package com.zepto.product.service;

import com.zepto.product.request.ProductRequest;
import com.zepto.product.request.ProductResponse;

public interface IProductService {

	public ProductResponse createProduct(ProductRequest productRequest);

	public String checkProductStatus(int productId);

}
