package com.prueba.tecnica.service;

import java.util.List;

import com.prueba.tecnica.entity.Estudiante;

public interface IEstudianteServices {
	
	 List <Estudiante> listarEstudiantes();
	
	 Estudiante findById(Long id);
	
	 Estudiante crearEstudiante (Estudiante estudiante);

}
