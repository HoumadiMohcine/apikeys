package com.example.apikeys;

import com.example.apikeys.entities.Apikeys;
import com.example.apikeys.repository.ApiKeysRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class ApikeysApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApikeysApplication.class, args);
	}

	@Bean
	@Order(1)
	public CommandLineRunner loadData(ApiKeysRepository apiKeysRepository) {
		return args -> {
			apiKeysRepository.save(Apikeys.builder().id(1L).username("user1").apiKey("123").build());
			apiKeysRepository.save(Apikeys.builder().id(2L).username("user2").apiKey("345").build());
			apiKeysRepository.save(Apikeys.builder().id(3L).username("user1").apiKey("345").build());
		};
	}

}
