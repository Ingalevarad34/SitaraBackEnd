package com.example.Sitara.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	// This method will configure global CORS mappings
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") // Allow CORS for all endpoints
				.allowedOrigins("http://localhost:3000,http://localhost:3001") // Allow only the React app running on this URL
				.allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS").allowedHeaders("*")
				.allowCredentials(true); // Allow credentials (cookies, authentication headers, etc.)
	}
}