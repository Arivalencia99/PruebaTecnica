package com.prueba.tecnica.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.entity.Pregunta;
import com.prueba.tecnica.service.IPreguntaService;

@RestController
@RequestMapping("/pregunta")
public class PreguntaController {
	private final IPreguntaService preguntaService;
	
	public PreguntaController(IPreguntaService preguntaService) {
		this.preguntaService = preguntaService;
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardarPregunta(@RequestBody Pregunta pregunta){
		return ResponseEntity.ok(preguntaService.crearPregunta(pregunta));
	}
	
	@GetMapping
	public ResponseEntity<?> listarPreguntas() {
		return ResponseEntity.ok(preguntaService.listarPreguntas());
	}

}
