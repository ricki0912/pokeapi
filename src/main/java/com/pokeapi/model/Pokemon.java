package com.pokeapi.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Value;

import helpers.Helper;

public class Pokemon {
	 //@Value("${api.pokeapi.v2}")
	 private  String HOST_V2="http://localhost:8080";
	 
	private String name=null;
	private String url=null;
	private Integer id=null;
	
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
			//this.url=HOST_V2+"/pokemones/"+id;
			this.id=Integer.valueOf(id);	
			this.url=Helper.replaceURL(url);
		}
	}
	public Integer getId() {
		return id;
	}
	
	
}
