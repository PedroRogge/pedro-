package com.Crud.pedro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class PedroApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedroApplication.class, args);
	}

}
