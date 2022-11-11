package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AspectosEjemploApplication {

	public static void main(String[] args) {
		ApplicationContext contexto=SpringApplication.run(AspectosEjemploApplication.class, args);
		
		ServicioA miservicioA=contexto.getBean(ServicioA.class); 
		System.out.println(miservicioA.metodo1()); 
		ServicioB miservicioB=contexto.getBean(ServicioB.class);
		System.out.println(miservicioB.metodo2());
	}

}
