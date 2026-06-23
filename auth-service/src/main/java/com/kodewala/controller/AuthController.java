package com.kodewala.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.request.AuthRequest;
import com.kodewala.request.SignupRequest;
import com.kodewala.response.AuthResponse;
import com.kodewala.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private final AuthService service;

	public AuthController(AuthService service) {
		this.service = service;
	}

	@PostMapping("/signup") // allow to register user
	public String signup(@RequestBody SignupRequest request) {

		return service.register(request);
	}

	@PostMapping("/login")
	public AuthResponse login(@RequestBody AuthRequest request) {

		return service.login(request);
	}
}