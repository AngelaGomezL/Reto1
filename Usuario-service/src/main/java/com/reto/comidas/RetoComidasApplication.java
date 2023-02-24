package com.reto.comidas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RetoComidasApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoComidasApplication.class, args);
	}

}
