package com.kodewala.security;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

	private final String SECRET = "mysecretkeymysecretkeymysecretkey123";

	private SecretKey getKey() {
		return Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));
	}

	public String generateToken(String username) {

		return Jwts.builder().subject(username).issuedAt(new Date())
				.expiration(new Date(System.currentTimeMillis() + 3600000)).signWith(getKey()).compact();
	}
}