package com.kodewala.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SearchProductRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchProductRedisApplication.class, args);
	}

}
