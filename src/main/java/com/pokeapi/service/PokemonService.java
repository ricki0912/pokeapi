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
public class PokemonService {
	 @Value("${api.pokeapi.v2}")
	 private  String HOST_V2;
	 
	@Autowired
	private RestTemplate template=new RestTemplate();

	
	public Respuesta all(int offset, int limit) {
		return template.getForObject(HOST_V2+"/pokemon-species?offset="+offset+"&limit="+limit, Respuesta.class);
	}
	public Object allOriginal(int offset, int limit) {
		return template.getForObject(HOST_V2+"/pokemon-species?offset="+offset+"&limit="+limit, Object.class);
	}
	
	public DetailPokemon find(int id) {
		return template.getForObject(HOST_V2+"/pokemon-species/"+id+"/", DetailPokemon.class);
	}
	
	public EvolutionPokemon getEvolutionChain(int id) {
		return template.getForObject( HOST_V2+"/evolution-chain/"+id+"/", EvolutionPokemon.class);
	}
	
	
}
