package com.pokeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pokeapi.model.DetailPokemon;
import com.pokeapi.model.EvolutionPokemon;
import com.pokeapi.model.Pokemon;
import com.pokeapi.model.Respuesta;


@Service
public class BaseService {
	 @Value("${api.pokeapi.v2}")
	 protected  String HOST_V2;
	 
	@Autowired
	protected RestTemplate template=new RestTemplate();

	
}
