package com.lawencon.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransaksiController {
	
	@GetMapping("/test2")
	public String test() {
		return "Test 2 berhasil";
		
	}
}
