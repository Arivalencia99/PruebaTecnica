package com.prueba.tecnica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prueba.tecnica.entity.Respuesta;
import com.prueba.tecnica.repository.RespuestaRepository;

@Service
public class RespuestaServiceImpl implements IRespuestaService{
	private final RespuestaRepository respuestaRepository;
	
	public RespuestaServiceImpl(RespuestaRepository respuestaRepository){
		this.respuestaRepository = respuestaRepository; 
	}
	
	@Override
	public Respuesta crearRespuesta(Respuesta respuesta) {
		// TODO Auto-generated method stub
		return this.respuestaRepository.save(respuesta);
	}

	@Override
	public List<Respuesta> listarRespuestas() {
		// TODO Auto-generated method stub
		return respuestaRepository.findAll();
	}

}
