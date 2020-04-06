package com.lawencon.app.controller;

import java.util.Base64;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseController <T>{
	String[] authUser(String auth) {
		byte[] decodedBytes = Base64.getDecoder().decode(auth);
		String decodedString = new String(decodedBytes);
		return decodedString.split(":");
	}
	
	T readValue(Class<T> klas, String content) throws Exception{
		return new ObjectMapper().readValue(content, klas);
	}
}
