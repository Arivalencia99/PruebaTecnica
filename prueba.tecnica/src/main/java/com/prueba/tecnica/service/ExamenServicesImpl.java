package com.prueba.tecnica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.prueba.tecnica.dto.RespuestaDTO;
import com.prueba.tecnica.dto.RespuestasDTO;
import com.prueba.tecnica.entity.Examen;
import com.prueba.tecnica.repository.ExamenRepository;
import com.prueba.tecnica.repository.PreguntaRepository;

@Service
public class ExamenServicesImpl implements IExamenServices{
private final ExamenRepository examenRepository;
private final PreguntaRepository preguntaRepository;
	
	public ExamenServicesImpl(ExamenRepository examenRepository, PreguntaRepository preguntaRepository) {
		this.examenRepository = examenRepository; 
		this.preguntaRepository = preguntaRepository;
	}
	
	@Override
	public Examen crearExamen(Examen examen) {
		return this.examenRepository.save(examen);
	}

	@Override
	public List<Examen> listarExamen() {
		return this.examenRepository.findAll();
	}

	@Override
	public Examen calificarExamen(RespuestasDTO respuestasDTO) {
		Optional<Examen> examen = examenRepository.findById(Long.valueOf(respuestasDTO.getIdExamen()));
		
		if (examen.isPresent()) {
			int puntos = 0;
			for(RespuestaDTO respuesta: respuestasDTO.getRespuestas()) {
				var pregunta = preguntaRepository.findById(Long.valueOf(respuesta.getIdPregunta()));
				if (pregunta.isPresent() && pregunta.get().getIdRespuestaCorrecta().equals(respuesta.getIdRespuesta())) {
					puntos += pregunta.get().getPeso();
				}
				examen.get().setPuntos(puntos);
			}
			
			return examenRepository.save(examen.get());	
		}
		return null;
	}

}
