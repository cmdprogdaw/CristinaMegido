package com.cris.examen;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cris.examen.humano.HumanoDAO;
import com.cris.examen.ordenes.Ordenes;

@Controller
public class RutasGenerales {
	
	@Autowired
	HumanoDAO humanoDAO;
	
	
	@GetMapping("/informacion")
	public String informacion(@Valid @ModelAttribute("ordenes") Ordenes ordenes) {
		
		return "formulario";
	}
	
	@PostMapping("/nuevaOrden")
	public String nuevaOrden() {
		
		return "ok";
	}
	
	
	
}
