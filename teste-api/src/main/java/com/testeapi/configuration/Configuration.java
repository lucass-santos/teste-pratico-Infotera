package com.testeapi.configuration;

import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

public class Configuration {

	
	static public WebClient getSelfWebClient() {
		return WebClient.builder().baseUrl("http://api.infotravel.com.br/api/v1").build();
	}

	
	static public WebClient getProgSelfWebClient() {
		return WebClient.builder()
				.baseUrl("http://api.infotravel.com.br/api/v1")
				.exchangeStrategies(ExchangeStrategies.builder()
				.codecs(codecs -> codecs.defaultCodecs().maxInMemorySize(500 * 1024)).build())
				.build();
	}
}
