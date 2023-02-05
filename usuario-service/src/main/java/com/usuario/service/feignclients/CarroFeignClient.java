package com.usuario.service.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.usuario.service.modelos.Carro;
//ASI ES CON SPRING CLOUD MAS SENCILLO Q REST TEMPLATE 

@FeignClient(name = "carro-service",url = "http://localhost:8002")//acceso al servicio y url, tmb al get,post,etc...
@RequestMapping("/carro")
public interface CarroFeignClient {

	@PostMapping()
	public Carro save(@RequestBody Carro carro); //request body osea el cuerpo de JSON q va guarda la informacion 
	
	
	
	@GetMapping("/usuario/{usuarioId}")
	public List<Carro> getCarros(@PathVariable("usuarioId") int usuarioId);


}

/*
fetch(url,{
     method:"POST",
     body: " modelo : bm1 , etc  ", // data del parametro usuario
     headers:{
    'Content-Type':'application/json',
}})  

 */