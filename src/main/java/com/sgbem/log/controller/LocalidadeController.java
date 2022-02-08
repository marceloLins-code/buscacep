package com.sgbem.log.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgbem.log.model.Localidade;
import com.sgbem.log.repository.LocalidadeRepository;
import com.sgbem.log.service.LocalidadeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/localidades")
public class LocalidadeController {
	
	LocalidadeService localidadeService;
	
	LocalidadeRepository localidadeRepository;
	
//	@PostMapping
//	public void criar(String localidade) {
//		localidadeService.buscarCep(localidade);  
//
//	}
	
	@GetMapping
	public List<Localidade> list() {
		return localidadeRepository.findAll();
	    

	}	
	
}
