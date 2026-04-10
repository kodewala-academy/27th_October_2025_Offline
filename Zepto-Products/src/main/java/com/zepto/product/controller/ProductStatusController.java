package com.zepto.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zepto.product.service.IProductService;

@Controller
public class ProductStatusController {

	@Autowired
	IProductService iProductService;

	@GetMapping("checkProductStatus")
	@ResponseBody
	public String checkStatus(@RequestParam("productId") String productID) {
		int productIDInt = Integer.parseInt(productID);
		String status = iProductService.checkProductStatus(productIDInt);
		return "Status of your product is : " + status;
	}
}
