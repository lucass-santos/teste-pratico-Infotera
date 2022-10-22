package com.testeapi.models.list;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompleteHotelList {

	private HotelPartsList[] hotelAvail;

	public HotelPartsList[] getHotelAvail() {
		return hotelAvail;
	}

	public void setHotelAvail(HotelPartsList[] hotelAvail) {
		this.hotelAvail = hotelAvail;
	}

	
	
}
