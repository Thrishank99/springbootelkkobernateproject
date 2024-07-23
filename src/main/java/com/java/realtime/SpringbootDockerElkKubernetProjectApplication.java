package com.java.realtime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class SpringbootDockerElkKubernetProjectApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SpringbootDockerElkKubernetProjectApplication.class);
	}  

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerElkKubernetProjectApplication.class, args);
		System.out.println("hello");
	}

}
