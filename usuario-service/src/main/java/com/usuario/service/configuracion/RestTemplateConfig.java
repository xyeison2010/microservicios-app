package com.usuario.service.configuracion;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig { //intercambia informacion con los demas microservicios, se usa en el servicio padre 

	@Bean //pongo bean, pq necesito inyectar autowired a esta clase 
	@LoadBalanced //este es de circuit-breaker
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}

//@bean -> @Component -> @service, @repository , @controller , @restcontroller > 
//gracias esto puedo usar la inyeccion de dependecnias @autowired -> pq necesito un bean 


//2 formas de comunicar microservicios,  REST TEMPLATE y OPENFEIGN(q es dependencia de Spring Cloud)
//SPRING CLOUD ES NETAmente al desarrollo de microservicios , agregando una anotacion a la clase MAIN,