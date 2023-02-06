package com.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //servidor q va registrar los microservicios clientes
public class EurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args);
	}

}

/*
EUREKA SERVER
es muy util pq no solamente guarda el microservicio, sino registros,
instancia y 
localizacion, su balanceo de carga y tolerancia a fallos 
Eurkea proporciona un dashboard q permite ver los microservicios 
existentes actualmente en el registro 
*/