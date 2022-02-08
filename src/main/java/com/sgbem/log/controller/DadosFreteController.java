package com.sgbem.log.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgbem.log.model.DadosFrete;
import com.sgbem.log.repository.DadosFreteRepository;
import com.sgbem.log.service.LocalidadeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/fretes")
public class DadosFreteController {
	
	DadosFreteRepository dadosFreteRepository;
	

	LocalidadeService localidadeService;
	
	@PostMapping
	public ResponseEntity<DadosFrete> criar(@RequestBody DadosFrete dadosFrete,HttpServletResponse response) {
	    dadosFreteRepository.save(dadosFrete);
	    
		localidadeService.buscarCep(dadosFrete);
	    
	    return ResponseEntity.status(HttpStatus.CREATED).body(dadosFrete);
	}
	
	

}
