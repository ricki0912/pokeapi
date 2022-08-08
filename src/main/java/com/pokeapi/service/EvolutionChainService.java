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
public class EvolutionChainService extends BaseService{
	 
	public EvolutionPokemon find(int id) {
		return template.getForObject( HOST_V2+"/evolution-chain/"+id+"/", EvolutionPokemon.class);
	}
	
	
}
