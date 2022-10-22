package com.testeapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessTokenAuthentication {

	private String accessToken;
	private String type;
	private Integer expire_seconds;
	public AccessTokenAuthentication() {
		
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getExpire_seconds() {
		return expire_seconds;
	}
	public void setExpire_seconds(Integer expire_seconds) {
		this.expire_seconds = expire_seconds;
	}
	@Override
	public String toString() {
		return "Quotes [accessToken=" + accessToken + ", type=" + type + ", expire_seconds=" + expire_seconds + "]";
	}
	
	
	
}
