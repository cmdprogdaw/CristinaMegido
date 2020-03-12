package com.cris.examen.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cris.examen.ordenes.Ordenes;

@Configuration
public class Builder {

	@Bean
	public Ordenes humano() {
		
		Ordenes humano = new Ordenes();
		
		return humano;
	}
	
	@Bean
	public Ordenes robot() {
		
		Ordenes robot = new Ordenes();
		
		return robot;
	}
}
