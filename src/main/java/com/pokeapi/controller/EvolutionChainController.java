package com.pokeapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pokeapi.model.DetailPokemon;
import com.pokeapi.model.EvolutionPokemon;
import com.pokeapi.model.Pokemon;
import com.pokeapi.model.Respuesta;
import com.pokeapi.service.EvolutionChainService;
import com.pokeapi.service.PokemonService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/evolution-chain")
public class EvolutionChainController {
	@Autowired
	private EvolutionChainService evolutionChainService;
	
	@GetMapping("/{id}")
	public EvolutionPokemon find(@PathVariable Integer id) {
		return this.evolutionChainService.find(id);
	}
	
}
