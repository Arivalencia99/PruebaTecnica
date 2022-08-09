package com.prueba.tecnica.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.dto.RespuestasDTO;
import com.prueba.tecnica.entity.Examen;
import com.prueba.tecnica.service.IExamenServices;

@RestController
@RequestMapping("/examen")
public class ExamenController {
	
	private final IExamenServices examenServices;

	public ExamenController(IExamenServices examenServices) {
		this.examenServices = examenServices;
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardarExamen(@RequestBody Examen examen){
		return ResponseEntity.ok(examenServices.crearExamen(examen));
	}
	
	@GetMapping
	public ResponseEntity<?> listarExamen() {
		return ResponseEntity.ok(examenServices.listarExamen());
	}
	
	@PostMapping("/calificar")
	public ResponseEntity<?> calificarExamen(@RequestBody RespuestasDTO respuestasDTO){
		return ResponseEntity.ok(examenServices.calificarExamen(respuestasDTO));
	}
}
