package com.lti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class MyKartApplication {

	public static void main(String[] args) {
		System.out.print("Welcome");
		SpringApplication.run(MyKartApplication.class, args);
		System.out.println("running....");
	}
	@SuppressWarnings("deprecation")
	@Bean
	public WebMvcConfigurer corsConfigurer()
	{
		return new WebMvcConfigurerAdapter() {
			
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/MyKart/rest").allowedOrigins("http://localhost:4200");
			}
			
		};
	}

	

}
