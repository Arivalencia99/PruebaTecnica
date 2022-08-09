package com.prueba.tecnica.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.entity.Respuesta;
import com.prueba.tecnica.service.IRespuestaService;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {
	private final IRespuestaService respuestaService;
	
	public RespuestaController(IRespuestaService respuestaService) {
		this.respuestaService = respuestaService;
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardarRespuesta(@RequestBody Respuesta respuesta){
		return ResponseEntity.ok(respuestaService.crearRespuesta(respuesta));
	}
	
	@GetMapping
	public ResponseEntity<?> listarRespuestas() {
		return ResponseEntity.ok(respuestaService.listarRespuestas());
	}

}
