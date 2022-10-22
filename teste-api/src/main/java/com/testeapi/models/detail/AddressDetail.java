package com.testeapi.models.detail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressDetail {

	
	private String zipcode;
	private String address;
	private String number;
	private String complement;
	private CityDetail city;
	private String neighborhood;
	private CoordinatesDetail coordinates;
	
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public CityDetail getCity() {
		return city;
	}
	public void setCity(CityDetail city) {
		this.city = city;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public CoordinatesDetail getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(CoordinatesDetail coordinates) {
		this.coordinates = coordinates;
	}
	
}
