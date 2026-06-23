package com.kodewala.jwt.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import com.kodewala.jwt.JwtUtil;

import reactor.core.publisher.Mono;

@Component
public class JwtAuthenticationFilter implements GlobalFilter {

	@Autowired
	private JwtUtil jwtUtil;

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

		String path = exchange.getRequest().getURI().getPath();

		// Public endpoints
		if (path.startsWith("/auth")) {
			return chain.filter(exchange);
		}

		String authHeader = exchange.getRequest().getHeaders().getFirst("Authorization");

		if (authHeader == null || !authHeader.startsWith("Bearer ")) {

			exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);

			return exchange.getResponse().setComplete();
		}

		String token = authHeader.substring(7);

		if (!jwtUtil.validateToken(token)) {

			exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);

			return exchange.getResponse().setComplete();
		}

		return chain.filter(exchange);
	}
}