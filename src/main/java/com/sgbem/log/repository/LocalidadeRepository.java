package com.sgbem.log.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgbem.log.model.Localidade;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Integer> {

}
