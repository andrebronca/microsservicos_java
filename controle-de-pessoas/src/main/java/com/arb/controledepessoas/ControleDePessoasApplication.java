package com.arb.controledepessoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //para registrar como um serviço
public class ControleDePessoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleDePessoasApplication.class, args);
	}

}
