package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SpringbootConfigClientApplication  implements CommandLineRunner{
	
	@Value("${foo}")
	String foo;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConfigClientApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(foo);
	}
	
	
	
	

}
