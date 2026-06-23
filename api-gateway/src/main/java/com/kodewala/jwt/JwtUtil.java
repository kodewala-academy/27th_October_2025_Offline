package com.kodewala.jwt;

import java.nio.charset.StandardCharsets;

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

	public boolean validateToken(String token) {

		try {
			Jwts.parser().verifyWith(getKey()).build().parseSignedClaims(token);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
}