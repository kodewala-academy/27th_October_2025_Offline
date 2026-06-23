package com.kodewala.service;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import com.kodewala.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	private final UserRepository repository;

	public CustomUserDetailsService(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		com.kodewala.entity.User user = repository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found"));

		return org.springframework.security.core.userdetails.User.withUsername(user.getUsername())
				.password(user.getPassword()).roles(user.getRole()).build();
	}
}