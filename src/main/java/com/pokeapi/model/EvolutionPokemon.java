package com.pokeapi.model;

import java.util.ArrayList;

import helpers.Helper;

public class EvolutionPokemon{
    private Object baby_trigger_item;
    private Chain chain;
    private int id;
	public Object getBaby_trigger_item() {
		return baby_trigger_item;
	}
	public void setBaby_trigger_item(Object baby_trigger_item) {
		this.baby_trigger_item = baby_trigger_item;
	}
	public Chain getChain() {
		return chain;
	}
	public void setChain(Chain chain) {
		this.chain = chain;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

class Chain{
    private ArrayList<EvolutionDetail> evolution_details;
    private ArrayList<Chain> evolves_to;
    private boolean is_baby;
    private Species species;
	public Species getSpecies() {
		return species;
	}
	public void setSpecies(Species species) {
		this.species = species;
	}
	public ArrayList<EvolutionDetail> getEvolution_details() {
		return evolution_details;
	}
	public void setEvolution_details(ArrayList<EvolutionDetail> evolution_details) {
		this.evolution_details = evolution_details;
	}
	public ArrayList<Chain> getEvolves_to() {
		return evolves_to;
	}
	public void setEvolves_to(ArrayList<Chain> evolves_to) {
		this.evolves_to = evolves_to;
	}
	public boolean isIs_baby() {
		return is_baby;
	}
	public void setIs_baby(boolean is_baby) {
		this.is_baby = is_baby;
	}
	
}

class EvolutionDetail{
    private Object gender;
    private Object held_item;
    private Object item;
    private Object known_move;
    private Object known_move_type;
    private Object location;
    private Object min_affection;
    private Object min_beauty;
    private Object min_happiness;
    private int min_level;
    private boolean needs_overworld_rain;
    private Object party_species;
    private Object party_type;
    private Object relative_physical_stats;
    private String time_of_day;
    private Object trade_species;
    private Trigger trigger;
    private boolean turn_upside_down;
	public Object getGender() {
		return gender;
	}
	public void setGender(Object gender) {
		this.gender = gender;
	}
	public Object getHeld_item() {
		return held_item;
	}
	public void setHeld_item(Object held_item) {
		this.held_item = held_item;
	}
	public Object getItem() {
		return item;
	}
	public void setItem(Object item) {
		this.item = item;
	}
	public Object getKnown_move() {
		return known_move;
	}
	public void setKnown_move(Object known_move) {
		this.known_move = known_move;
	}
	public Object getKnown_move_type() {
		return known_move_type;
	}
	public void setKnown_move_type(Object known_move_type) {
		this.known_move_type = known_move_type;
	}
	public Object getLocation() {
		return location;
	}
	public void setLocation(Object location) {
		this.location = location;
	}
	public Object getMin_affection() {
		return min_affection;
	}
	public void setMin_affection(Object min_affection) {
		this.min_affection = min_affection;
	}
	public Object getMin_beauty() {
		return min_beauty;
	}
	public void setMin_beauty(Object min_beauty) {
		this.min_beauty = min_beauty;
	}
	public Object getMin_happiness() {
		return min_happiness;
	}
	public void setMin_happiness(Object min_happiness) {
		this.min_happiness = min_happiness;
	}
	public int getMin_level() {
		return min_level;
	}
	public void setMin_level(int min_level) {
		this.min_level = min_level;
	}
	public boolean isNeeds_overworld_rain() {
		return needs_overworld_rain;
	}
	public void setNeeds_overworld_rain(boolean needs_overworld_rain) {
		this.needs_overworld_rain = needs_overworld_rain;
	}
	public Object getParty_species() {
		return party_species;
	}
	public void setParty_species(Object party_species) {
		this.party_species = party_species;
	}
	public Object getParty_type() {
		return party_type;
	}
	public void setParty_type(Object party_type) {
		this.party_type = party_type;
	}
	public Object getRelative_physical_stats() {
		return relative_physical_stats;
	}
	public void setRelative_physical_stats(Object relative_physical_stats) {
		this.relative_physical_stats = relative_physical_stats;
	}
	public String getTime_of_day() {
		return time_of_day;
	}
	public void setTime_of_day(String time_of_day) {
		this.time_of_day = time_of_day;
	}
	public Object getTrade_species() {
		return trade_species;
	}
	public void setTrade_species(Object trade_species) {
		this.trade_species = trade_species;
	}
	public Trigger getTrigger() {
		return trigger;
	}
	public void setTrigger(Trigger trigger) {
		this.trigger = trigger;
	}
	public boolean isTurn_upside_down() {
		return turn_upside_down;
	}
	public void setTurn_upside_down(boolean turn_upside_down) {
		this.turn_upside_down = turn_upside_down;
	}
    
}

class Species{
	private String name;
	private String url;
	private Integer id;
	public Integer getId() {
		return id;
	}
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
		String id=Helper.extractId(url, Helper.ER_POKEMON_ESPECIES);
		if(id!=null) {
			this.id=Integer.parseInt(id);
			this.url=Helper.replaceURL(url);
		}
		//this.url = url;
	}
}

 class Trigger{
	 private String name;
	 private String url;
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public String getUrl() {
		return url;
	}*/
	public void setUrl(String url) {
		this.url = url;
	}
	
}