package com.zepto.product.category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zepto.product.category.request.CategoryRequest;
import com.zepto.product.category.service.ProductCategoryService;

@Controller
public class ProductCategoryController {

	@Autowired
	ProductCategoryService productCategoryService;

	@PostMapping("createCategory")
	public String createCategory(@ModelAttribute CategoryRequest categoryRequest) {
		productCategoryService.createCategory(categoryRequest);
		return "find-category";
	}

	@GetMapping("findCategory")
	@ResponseBody
	public String getCategory() {
		productCategoryService.getCategory(1);
		return "found category";
	}
}
