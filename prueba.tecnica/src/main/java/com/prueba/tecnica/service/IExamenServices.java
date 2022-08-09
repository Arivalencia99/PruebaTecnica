package com.prueba.tecnica.service;

import java.util.List;

import com.prueba.tecnica.dto.RespuestasDTO;
import com.prueba.tecnica.entity.Examen;

public interface IExamenServices {
	
	Examen crearExamen(Examen examen);
	
	List<Examen> listarExamen();
	
	Examen calificarExamen(RespuestasDTO respuestasDTO);

}
