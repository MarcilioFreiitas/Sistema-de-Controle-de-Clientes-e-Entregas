package com.maximatech.desafio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class Config {

	
	
	@Bean
	public OpenAPI configOpenAPi() {
		return new OpenAPI().info(
				new Info().description("API Clientes")
				.version("1.0.0")
				.title("API de clientes")
				
				
				);
	}
}
