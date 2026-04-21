package com.zepto.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zepto.product.request.ProductResponse;
import com.zepto.product.service.IProductService;

@Controller
public class FindProductsController {

	@Autowired
	IProductService iProductService;

	@GetMapping("findProducts")
	public String findProducts(@RequestParam("name") String name, @RequestParam("status") String status, Model model) {
		ProductResponse productResponse = iProductService.findProducts(name, status);

		model.addAttribute("response", productResponse);
		return "product-details";
	}
}
