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
import com.pokeapi.service.PokemonService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/pokemones")
public class PokemonController {
	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("/all-original")
	public Object allOriginal(@RequestParam("offset") Integer offset, @RequestParam("limit") Integer limit){
		//return offset+" - "+limit;
		return this.pokemonService.allOriginal(offset, limit);
	}
	
	@GetMapping("")
	public Respuesta all(@RequestParam("offset") Integer offset, @RequestParam("limit") Integer limit){
		return this.pokemonService.all(offset, limit);
	}
	
	@GetMapping("/{id}")
	public DetailPokemon  find(@PathVariable Integer id) {
		return this.pokemonService.find(id);
	}
	
	@GetMapping("/evolution-chain/{id}")
	public EvolutionPokemon getEvolutionChain(@PathVariable Integer id) {
		return this.pokemonService.getEvolutionChain(id);
	}
	
	
	
	
	
}
