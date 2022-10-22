package com.testeapi.models.detail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompleteHotelDetail {

	private HotelPartsDetail hotel;

	public HotelPartsDetail getHotel() {
		return hotel;
	}

	public void setHotel(HotelPartsDetail hotel) {
		this.hotel = hotel;
	}
	
	
}
