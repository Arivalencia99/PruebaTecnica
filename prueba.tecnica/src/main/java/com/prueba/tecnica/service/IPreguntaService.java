package com.prueba.tecnica.service;

import java.util.List;

import com.prueba.tecnica.entity.Pregunta;

public interface IPreguntaService {

	Pregunta crearPregunta(Pregunta pregunta);
	List<Pregunta> listarPreguntas();
}
