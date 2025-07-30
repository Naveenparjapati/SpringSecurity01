package com.navi8.Day1SEcurity.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
      //security filter chain **interface**
	
	@Bean
	public SecurityFilterChain securityFilteConfig(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests(req -> {
		    req.requestMatchers("/welcome")
		        .permitAll()
		        .anyRequest()
		        .authenticated();
		}).formLogin();

		return http.build();


		
	}
}
