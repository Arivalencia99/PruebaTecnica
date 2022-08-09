package com.prueba.tecnica.dto;

import java.util.List;

public class RespuestasDTO {
	private Integer idExamen;
	private List<RespuestaDTO> respuestas;
	
	public Integer getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(Integer idExamen) {
		this.idExamen = idExamen;
	}
	public List<RespuestaDTO> getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(List<RespuestaDTO> respuestas) {
		this.respuestas = respuestas;
	}
	
}
