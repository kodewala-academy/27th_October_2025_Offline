package com.amazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amazon.request.OnboardingRequest;

@Controller
public class SellerOnboardingController {

	@PostMapping("onboarding/{id}")
	@ResponseBody
	public String doOnboarding(@ModelAttribute OnboardingRequest request) {
		System.out.println(" Request Received for Seller Onboarding!");
		System.out.println(" Seller Name : " + request.getSellerName());
		System.out.println(" Seller Mobile : " + request.getSellerMobile());
		System.out.println(" Seller Email  : " + request.getSellerEmail());
		System.out.println(" Seller Type : " + request.getSellerType());
		return "We have received the onbaording request! Our team will get in touch with you for next steps!";
	}

}
