package com.prueba.tecnica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prueba.tecnica.entity.Estudiante;
import com.prueba.tecnica.repository.EstudianteRepository;

@Service
public class EstudianteServicesImpl implements IEstudianteServices {
	private final EstudianteRepository estudianteRepository;
	
	public EstudianteServicesImpl(EstudianteRepository estudianteRepository){
		this.estudianteRepository = estudianteRepository; 
	}

	@Override
	public Estudiante crearEstudiante(Estudiante estudiante) {
		return this.estudianteRepository.save(estudiante);
	}

	@Override
	public List<Estudiante> listarEstudiantes() {
		return this.estudianteRepository.findAll();
	}

	@Override
	public Estudiante findById(Long id) {
		return this.findById(id);
	}

}
