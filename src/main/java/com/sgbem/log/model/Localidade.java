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
public class Localidade {
	
		@JsonIgnore
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY )
		private Integer id;
		
		private String cep;
	    private String logradouro;
	    private String complemento;
	    private String bairro;
	    private String localidade;
	    private String uf;
	    private String ibge;
	    private String gia;
	    private String ddd;
	    private String siafi;  
		
		public Localidade() {
			
		}



}
