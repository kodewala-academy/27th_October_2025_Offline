package com.kodewala.sample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.sample.controller.dto.LoginDTO;
import com.kodewala.sample.controller.response.LoginResponse;

@RestController // @Controller + Responsebody
@RequestMapping("/user/api/")
public class LoginController {

	@GetMapping("login")
	public ResponseEntity<LoginResponse> doLogin(@RequestBody LoginDTO request) 
	{
		System.out.println(" user name : " + request.getUser());
		
		LoginResponse loginResponse = new LoginResponse();
		loginResponse.setMessage(" Login success");
		
		return ResponseEntity.ok(loginResponse);
	}

}
