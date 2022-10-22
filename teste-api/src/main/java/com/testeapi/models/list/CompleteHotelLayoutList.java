package com.testeapi.models.list;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompleteHotelLayoutList {

	private HotelPartsLayoutList[] hotels;

	public HotelPartsLayoutList[] getHotels() {
		return hotels;
	}

	public void setHotels(HotelPartsLayoutList[] hotels) {
		this.hotels = hotels;
	}
	
	
}
