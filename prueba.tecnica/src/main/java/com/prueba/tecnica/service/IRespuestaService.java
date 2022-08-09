package com.prueba.tecnica.service;

import java.util.List;

import com.prueba.tecnica.entity.Respuesta;

public interface IRespuestaService {

	Respuesta crearRespuesta(Respuesta respuesta);
	List<Respuesta> listarRespuestas();
}
