package com.example.springsocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import com.example.springsocial.config.AppProperties;

// http://localhost:8080/oauth2/authorize/facebook?redirect_uri==http://localhost:3000/oauth2/redirect
// http://localhost:8080/oauth2/authorize/google?redirect_uri=http://localhost:3000/oauth2/redirect
@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SpringSocialApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringSocialApplication.class, args);
	}
}
