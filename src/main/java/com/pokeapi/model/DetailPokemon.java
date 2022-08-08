package com.pokeapi.model;

import java.util.ArrayList;

import helpers.Helper;

public class DetailPokemon{
	 private int base_happiness;
	 private int capture_rate;
	 private Color color;
	 private ArrayList<EggGroup> egg_groups;
	 private EvolutionChain evolution_chain;
	 private EvolvesFromSpecies evolves_from_species;
	 private ArrayList<FlavorTextEntry> flavor_text_entries;
	 private ArrayList<Object> form_descriptions;
	 private boolean forms_switchable;
	 private int gender_rate;
	 private ArrayList<Genera> genera;
	 private Generation generation;
	 private GrowthRate growth_rate;
	 private Habitat habitat;
	 private boolean has_gender_differences;
	 private int hatch_counter;
	 private int id;
	 private boolean is_baby;
	 private boolean is_legendary;
	 private boolean is_mythical;
	 private String name;
	 private ArrayList<Name> names;
	 private int order;
	 private ArrayList<PalParkEncounter> pal_park_encounters;
	 private ArrayList<PokedexNumber> pokedex_numbers;
	 private Shape shape;
	 private ArrayList<Variety> varieties;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Name> getNames() {
		return names;
	}
	public void setNames(ArrayList<Name> names) {
		this.names = names;
	}
	public EvolutionChain getEvolution_chain() {
		return evolution_chain;
	}
	public void setEvolution_chain(EvolutionChain evolution_chain) {
		this.evolution_chain = evolution_chain;
	}
	public ArrayList<Variety> getVarieties() {
		return varieties;
	}
	public void setVarieties(ArrayList<Variety> varieties) {
		this.varieties = varieties;
	}
	public ArrayList<FlavorTextEntry> getFlavor_text_entries() {
		return flavor_text_entries;
	}
	public void setFlavor_text_entries(ArrayList<FlavorTextEntry> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}
	 
	 
	
	

	 
}

class Area{
 private String name;
 private String url;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
 
}

 class Color{
 private String name;
 private String url;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
 
}

 class EggGroup{
 private String name;
 private String url;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
 
}

 class EvolutionChain{
	 private String url;
	 private Integer id;
	 
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		String id=Helper.extractId(url, Helper.ER_EVOLUTION_CHAIN);
		if(id!=null) {
			this.id=Integer.parseInt(id);
			this.url=Helper.replaceURL(url);
		}
		this.url = url;
	}

	public Integer getId() {
		return id;
	}
	
	
	
 
}

class EvolvesFromSpecies{
 private String name;
 private String url;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
 
}

 class FlavorTextEntry{
 private String flavor_text;
 private Language language;
 private Version version;
public String getFlavor_text() {
	return flavor_text;
}
public void setFlavor_text(String flavor_text) {
	this.flavor_text = flavor_text;
}
public Language getLanguage() {
	return language;
}
public void setLanguage(Language language) {
	this.language = language;
}
public Version getVersion() {
	return version;
}
public void setVersion(Version version) {
	this.version = version;
}
 
}

class Genera{
 private String genus;
 private Language language;
public String getGenus() {
	return genus;
}
public void setGenus(String genus) {
	this.genus = genus;
}
public Language getLanguage() {
	return language;
}
public void setLanguage(Language language) {
	this.language = language;
}
 
 
}

class Generation{
 private String name;
 private String url;
}

 class GrowthRate{
 private String name;
 private String url;
}

 class Habitat{
 private String name;
 private String url;
}

 class Language{
 private String name;
 private String url;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
 
 
}

 class Name{
 private Language language;
 private String name;
public Language getLanguage() {
	return language;
}
public void setLanguage(Language language) {
	this.language = language;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
}

 class PalParkEncounter{
 private Area area;
 private int base_score;
 private int rate;
public Area getArea() {
	return area;
}
public void setArea(Area area) {
	this.area = area;
}
public int getBase_score() {
	return base_score;
}
public void setBase_score(int base_score) {
	this.base_score = base_score;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
 
}

 class Pokedex{
 private String name;
 private String url;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
 
}

 class PokedexNumber{
 private int entry_number;
 private Pokedex pokedex;
public int getEntry_number() {
	return entry_number;
}
public void setEntry_number(int entry_number) {
	this.entry_number = entry_number;
}
public Pokedex getPokedex() {
	return pokedex;
}
public void setPokedex(Pokedex pokedex) {
	this.pokedex = pokedex;
}
 
}

 class Shape{
 private String name;
 private String url;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
 
}

 class Variety{
 private boolean is_default;
 private Pokemon pokemon;
public boolean isIs_default() {
	return is_default;
}
public void setIs_default(boolean is_default) {
	this.is_default = is_default;
}
public Pokemon getPokemon() {
	return pokemon;
}
public void setPokemon(Pokemon pokemon) {
	this.pokemon = pokemon;
}
 
}

 class Version{
 private String name;
 private String url;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
 
}