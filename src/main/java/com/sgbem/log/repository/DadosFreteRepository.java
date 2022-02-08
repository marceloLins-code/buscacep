package com.sgbem.log.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgbem.log.model.DadosFrete;

@Repository
public interface DadosFreteRepository extends JpaRepository<DadosFrete, Integer> {
	
	

}
