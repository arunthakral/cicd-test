package com.ci.cd;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdTestApplication {
	
	@PostConstruct
	public void hello() {
		System.out.println("hello");
		
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdTestApplication.class, args);
	}
	
	

}
