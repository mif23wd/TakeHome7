package com.lawencon.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.lawencon.app.model.TransaksiTiket;
import com.lawencon.app.service.AppService;

@SuppressWarnings("rawtypes")
@RestController
public class TransaksiController extends BaseController{
	
	@Autowired
	AppService appservice;

	@SuppressWarnings("unchecked")
	@PostMapping("/jpa/belitiket")
	ResponseEntity<?> transaksiJpa(@RequestHeader("Authorization") String auth, @RequestBody String content){
		try {
			String[] userpass = authUser(auth);
			TransaksiTiket tt = (TransaksiTiket) readValue(TransaksiTiket.class, content);
			return new ResponseEntity<>(appservice.insertAndCetakStrukJpa(userpass[0], userpass[1], tt), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/hibernate/belitiket")
	ResponseEntity<?> transaksiHibernate(@RequestHeader("Authorization") String auth, @RequestBody String content){
		try {
			String[] userpass = authUser(auth);
			TransaksiTiket tt = (TransaksiTiket) readValue(TransaksiTiket.class, content);
			return new ResponseEntity<>(appservice.insertAndCetakStrukHibernate(userpass[0], userpass[1], tt), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
}
