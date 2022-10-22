package com.testeapi.models.detail;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelPartsDetail {

	private Integer id;
	private String name;
	private String description;
	private AddressDetail address;
	ArrayList<Object> images = new ArrayList<Object>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public AddressDetail getAddress() {
		return address;
	}
	public void setAddress(AddressDetail address) {
		this.address = address;
	}
	public ArrayList<Object> getImages() {
		return images;
	}
	public void setImages(ArrayList<Object> images) {
		this.images = images;
	}
	
	
	
}
