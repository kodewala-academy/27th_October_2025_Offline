package com.kodewala.service;

import org.springframework.security.authentication.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.kodewala.entity.User;
import com.kodewala.repository.UserRepository;
import com.kodewala.request.AuthRequest;
import com.kodewala.request.SignupRequest;
import com.kodewala.response.AuthResponse;
import com.kodewala.security.JwtUtil;

@Service
public class AuthService {

	private final UserRepository repository;
	private final PasswordEncoder passwordEncoder;
	private final AuthenticationManager authenticationManager;
	private final JwtUtil jwtUtil;

	public AuthService(UserRepository repository, PasswordEncoder passwordEncoder,
			AuthenticationManager authenticationManager, JwtUtil jwtUtil) {

		this.repository = repository;
		this.passwordEncoder = passwordEncoder;
		this.authenticationManager = authenticationManager;
		this.jwtUtil = jwtUtil;
	}

	public String register(SignupRequest request) {

		User user = new User();

		user.setUsername(request.getUsername());
		user.setPassword(passwordEncoder.encode(request.getPassword()));
		user.setRole(request.getRole());

		repository.save(user);

		return "User Registered Successfully";
	}

	public AuthResponse login(AuthRequest request) {

		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

		String token = jwtUtil.generateToken(request.getUsername());

		return new AuthResponse(token);
	}
}