package com.prueba.tecnica.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.tecnica.entity.Estudiante;
import com.prueba.tecnica.service.IEstudianteServices;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

	private final IEstudianteServices estudianteServices;

	public EstudianteController(IEstudianteServices estudianteServices) {
		this.estudianteServices = estudianteServices;
	}

	@PostMapping("/guardar")
	public ResponseEntity<?> guardarEstudiante(@RequestBody Estudiante estudiante){
		return ResponseEntity.ok(estudianteServices.crearEstudiante(estudiante));
	}
	
	@GetMapping
	public ResponseEntity<?> listarEstudiantes() {
		return ResponseEntity.ok(estudianteServices.listarEstudiantes());
	}

}
