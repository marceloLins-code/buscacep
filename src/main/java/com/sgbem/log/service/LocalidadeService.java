package com.sgbem.log.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.sgbem.log.model.DadosFrete;
import com.sgbem.log.model.Localidade;
import com.sgbem.log.repository.LocalidadeRepository;

@Service
public class LocalidadeService {	
	
	LocalidadeRepository localidadeRepository;
	
	public Localidade buscarCep(DadosFrete calculoFrete) {
		
		Localidade localidade = new Localidade();		
		try {
			
				
			URL url = new URL("https://viacep.com.br/ws/"+calculoFrete.getCepDestino()+"/json/");
			URLConnection connection = url.openConnection();
			InputStream is = connection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

			String cep = "";
			StringBuilder jsonCep = new StringBuilder();

			while ((cep = br.readLine()) != null) {
				jsonCep.append(cep);
			}
			localidade  = new Gson().fromJson(jsonCep.toString(), Localidade.class);
			
			localidade.setCep(localidade.getCep());
			localidade.setLogradouro(localidade.getLogradouro());
			localidade.setComplemento(localidade.getComplemento());
			localidade.setBairro(localidade.getBairro());
			localidade.setLocalidade(localidade.getLocalidade());
			localidade.setIbge(localidade.getIbge());
			localidade.setGia(localidade.getGia());
			localidade.setDdd(localidade.getDdd());
			localidade.setSiafi(localidade.getSiafi());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return localidadeRepository.save(localidade);
		
		

		
		
		
//		Double valorFrete = 0.00;
//
//		if (calculoFrete.getCepOrigem().equalsIgnoreCase(calculoFrete.getCepDestino().getCep())
//				&& calculoFrete.getDdd().equalsIgnoreCase(calculoFrete.getCepDestino().getDdd())) {
//			valorFrete = calculoFrete.getValor() * 0.50;
//
//		} else if (calculoFrete.getCepOrigem().equalsIgnoreCase(calculoFrete.getCepDestino().getCep())) {
//			valorFrete = calculoFrete.getValor() * 0.75;
//		}
//
//		// verificar "><"
//		else 
//			valorFrete = calculoFrete.getValor();			
//		calculoFrete.setValor(valorFrete);	

	}
	
}
