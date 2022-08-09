package com.prueba.tecnica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prueba.tecnica.entity.Pregunta;
import com.prueba.tecnica.repository.PreguntaRepository;

@Service
public class PreguntaServiceImpl implements IPreguntaService{
	private final PreguntaRepository preguntaRepository;
	
	public PreguntaServiceImpl(PreguntaRepository preguntaRepository) {
		this.preguntaRepository = preguntaRepository; 
	}
	
	@Override
	public Pregunta crearPregunta(Pregunta pregunta) {
		return this.preguntaRepository.save(pregunta);
	}

	@Override
	public List<Pregunta> listarPreguntas() {
		return this.preguntaRepository.findAll();
	}

}
