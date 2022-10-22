package com.testeapi.models.detail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityDetail {

	private String name;
	private CountryDetail country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CountryDetail getCountry() {
		return country;
	}
	public void setCountry(CountryDetail country) {
		this.country = country;
	}
	
	
}
