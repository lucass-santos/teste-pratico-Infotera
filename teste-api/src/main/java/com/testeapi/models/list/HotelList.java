package com.testeapi.models.list;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelList {

	private Integer id;
	private String keyDetail;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKeyDetail() {
		return keyDetail;
	}
	public void setKeyDetail(String keyDetail) {
		this.keyDetail = keyDetail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
