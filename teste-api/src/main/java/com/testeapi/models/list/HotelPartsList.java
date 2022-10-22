package com.testeapi.models.list;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelPartsList {
	
	private HotelList hotel;
	private LowestFareList lowestFare;
	
	public HotelList getHotel() {
		return hotel;
	}
	public void setHotel(HotelList hotel) {
		this.hotel = hotel;
	}
	public LowestFareList getLowestFare() {
		return lowestFare;
	}
	public void setLowestFare(LowestFareList lowestFare) {
		this.lowestFare = lowestFare;
	}

	
}
