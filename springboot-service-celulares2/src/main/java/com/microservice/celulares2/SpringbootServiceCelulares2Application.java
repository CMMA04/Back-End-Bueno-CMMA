package com.microservice.celulares2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootServiceCelulares2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceCelulares2Application.class, args);
	}

}
