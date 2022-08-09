package com.prueba.tecnica.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pregunta")
public class Pregunta  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "pregunta_examen")
	private String preguntaExamen;
	
	@Column(name = "id_respuesta_correcta")
	private Integer idRespuestaCorrecta;
	
	@Column(name = "peso")
	private Integer peso;
	
	@OneToMany()
	private Set<Respuesta> respuestas;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPreguntaExamen() {
		return preguntaExamen;
	}

	public void setPreguntaExamen(String preguntaExamen) {
		this.preguntaExamen = preguntaExamen;
	}

	public Integer getIdRespuestaCorrecta() {
		return idRespuestaCorrecta;
	}

	public void setIdRespuestaCorrecta(Integer idRespuestaCorrecta) {
		this.idRespuestaCorrecta = idRespuestaCorrecta;
	}

	public Set<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(Set<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

}
