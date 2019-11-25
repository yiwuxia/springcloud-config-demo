package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


@EnableConfigServer
@SpringBootApplication
public class SpringbootConfigServerApplication {

	public static void main(String[] args) {
		
		
		 ApplicationContext context =	SpringApplication.run(SpringbootConfigServerApplication.class, args);
	   
	
	
	
	}


		

}
