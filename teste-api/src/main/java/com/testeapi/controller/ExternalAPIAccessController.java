package com.testeapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.testeapi.configuration.Configuration;
import com.testeapi.models.list.CompleteHotelLayoutList;
import com.testeapi.models.list.CompleteHotelList;
import com.testeapi.models.list.HotelPartsLayoutList;
import com.testeapi.models.AccessTokenAuthentication;
import com.testeapi.models.BodyAuthentication;
import com.testeapi.models.detail.CompleteHotelDetail;

@RestController
@RequestMapping("/")
public class ExternalAPIAccessController {

	@GetMapping(path = "/search/{destination}/{start}/{end}/{occupancy}")
	public ResponseEntity<CompleteHotelLayoutList> hotelList(@RequestBody BodyAuthentication bodyAuthentication,
			@PathVariable String destination, @PathVariable String start,
			@PathVariable String end, @PathVariable String occupancy) {
		
		WebClient client = Configuration.getProgSelfWebClient();

		AccessTokenAuthentication accessTokenAuthentication = getAuthentication(bodyAuthentication, client);

		CompleteHotelList hotelSimple = client.get()
				.uri(String.format("/avail/hotel?destination=%s&start=%s&end=%s&occupancy=%s"
				,destination, start, end, occupancy))
				.header("Authorization", accessTokenAuthentication.getType()+ " " +accessTokenAuthentication.getAccessToken())
				.header("Accept", "application/json")
				.retrieve().bodyToMono(CompleteHotelList.class).block();

		CompleteHotelLayoutList hotelModel = new CompleteHotelLayoutList();

		hotelModel.setHotels(new HotelPartsLayoutList[hotelSimple.getHotelAvail().length]);

		for (int i = 0; i < hotelSimple.getHotelAvail().length; i++) {
			hotelModel.getHotels()[i] = new HotelPartsLayoutList();
			hotelModel.getHotels()[i].setId(hotelSimple.getHotelAvail()[i].getHotel().getId());
			hotelModel.getHotels()[i].setKeyDetail(hotelSimple.getHotelAvail()[i].getHotel().getKeyDetail());
			hotelModel.getHotels()[i].setName(hotelSimple.getHotelAvail()[i].getHotel().getName());
			hotelModel.getHotels()[i].setCheckIn(hotelSimple.getHotelAvail()[i].getLowestFare().getCheckIn());
			hotelModel.getHotels()[i].setCheckOut(hotelSimple.getHotelAvail()[i].getLowestFare().getCheckOut());
		}

		return new ResponseEntity<CompleteHotelLayoutList>(hotelModel, HttpStatus.OK);
	}

	@GetMapping(path = "/hotel/{keyDetail}")
	public ResponseEntity<CompleteHotelDetail> hotelDetail(@RequestBody BodyAuthentication bodyAuthentication,
			@PathVariable String keyDetail) {

		WebClient client = Configuration.getSelfWebClient();
		
		AccessTokenAuthentication accessTokenAuthentication = getAuthentication(bodyAuthentication, client);

		CompleteHotelDetail hotelObject = client.get().uri(String.format("/utility/hotelDetail/%s", keyDetail))
				.header("Authorization", accessTokenAuthentication.getType()+" " + accessTokenAuthentication.getAccessToken())
				.header("Accept", "application/json")
				.retrieve().bodyToMono(CompleteHotelDetail.class).block();

		return new ResponseEntity<CompleteHotelDetail>(hotelObject, HttpStatus.OK);
	}

	private AccessTokenAuthentication getAuthentication(BodyAuthentication bodyAuthentication, WebClient client) {

		AccessTokenAuthentication accessTokenAuthentication = client.post()
				.uri("/authenticate")
				.bodyValue(bodyAuthentication)
				.retrieve()
				.bodyToMono(AccessTokenAuthentication.class)
				.block();

		return accessTokenAuthentication;
	}

}
