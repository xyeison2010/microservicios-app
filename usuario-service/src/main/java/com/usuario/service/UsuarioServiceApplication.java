package com.usuario.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // comunicacion entre los microservecios, se coloca en el servicio padre
@SpringBootApplication
@EnableEurekaClient  //este cliente lo registre en el servidor de eureka 
public class UsuarioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioServiceApplication.class, args);
	}

}

/*desde el principal servicio parece q puedo consumir toda la logicas
de los controladores get,post,put,delete,  de los demas servicios.
gracias a springcloud , o restTemplate.
*/