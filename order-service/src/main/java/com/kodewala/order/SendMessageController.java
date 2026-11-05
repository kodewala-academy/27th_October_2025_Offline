package com.kodewala.order;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class SendMessageController {

	
	
	@PostMapping("/v2/sendmessage") // base
	public String send1(String text)
	{
		return "New Features - Blue / Read message";
	}
	
	
	@PostMapping("/v3/sendmessage") // latest 
	public String send(String text)
	{
		return "Basic and Old features";
	}
	
	
}
