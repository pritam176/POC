package com.pkm.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pkm.poc")
public class FactoryPatternPocApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(FactoryPatternPocApplication.class, args);
		
	}

	
}
