package com.johanapp.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johanapp.persona.model.Pais;
import com.johanapp.persona.service.PaisService;

@RestController
@RequestMapping("/pais/")
public class PaisRest {
	
	@Autowired
	private PaisService paisService;
	
	@GetMapping
	ResponseEntity<List<Pais>>getAllPaises(){
			
		return ResponseEntity.ok(paisService.findAll());
	}

}
