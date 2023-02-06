package com.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer  //de spring cloud
public class ConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceApplication.class, args);
	}

}
/*
 va a repositorio git y obtiene todas la propiedades indicado en el repositorio y la rama ,desde el yaml
  search-paths: config-data -> aqui se va guardar los cambios o configuracion de los archivos
 //GRACIAS A LA dependencia spring-Bootstrap se puede asignar los puertos originales de los microservicios
 
 desde esta  config-server pa poder traer la informacion 
 para poder hacer cambios , los puertos reales de los servicios,
 esta en config-data , 
 
 
 ESTE SERVIDOR DE CONFIGURACION NOS AYUDA MUCHO PARA MANEJAR LAS RAMAS Y PUERTOS En un proyecto real existen muchas mas 
 */