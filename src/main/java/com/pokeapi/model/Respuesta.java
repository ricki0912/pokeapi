package com.pokeapi.model;

import java.util.List;

import helpers.Helper;

public class Respuesta {
	 
	private Integer count=0;
	private String next;
	private String previous;
	private List<Pokemon> results;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<Pokemon> getResults() {
		return results;
	}
	public void setResults(List<Pokemon> results) {
		this.results = results;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next =Helper.replaceURL(next);
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = Helper.replaceURL(previous);
	}
	


	
	
}
