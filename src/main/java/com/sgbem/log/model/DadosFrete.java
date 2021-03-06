package com.sgbem.log.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class DadosFrete {
	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer id;
	
	private Double peso;
	private String cepOrigem;
	private String cepDestino;
	//private String ddd;
	private String nomeDestinatario;
	//private Double valor;
	
	public DadosFrete() {
		
	}

}
